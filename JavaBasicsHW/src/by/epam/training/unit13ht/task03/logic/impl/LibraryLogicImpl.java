package by.epam.training.unit13ht.task03.logic.impl;

import by.epam.training.unit13ht.task03.dao.DAOProvider;
import by.epam.training.unit13ht.task03.dao.LibraryCreatorDAO;
import by.epam.training.unit13ht.task03.entity.Book;
import by.epam.training.unit13ht.task03.entity.Library;
import by.epam.training.unit13ht.task03.exception.DAOException;
import by.epam.training.unit13ht.task03.exception.LogicException;
import by.epam.training.unit13ht.task03.logic.LibraryLogic;
import by.epam.training.unit13ht.task03.logic.comparator.BookByPriceComparator;
import by.epam.training.unit13ht.task03.logic.comparator.BookByYearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryLogicImpl implements LibraryLogic {

    @Override
    public void add(Book book) throws LogicException {

        try {

            DAOProvider factory = DAOProvider.getInstance();
            LibraryCreatorDAO libraryDAO = factory.getLibraryCreatorDAO(); // вызывается объект, который умеет делать то, что заставляет его делать интерфейс LibraryCreatorDAO

            Library library = libraryDAO.create();
            library.add(book);
            libraryDAO.save(library);

        } catch (DAOException e) {
            throw new LogicException(e);
        }
    }

    @Override
    public void remove(Book book) throws LogicException {

        try {

            DAOProvider factory = DAOProvider.getInstance();
            LibraryCreatorDAO libraryDAO = factory.getLibraryCreatorDAO();

            Library library = libraryDAO.create();

            int initSize = library.getBooks().size();
            library.remove(book);

            int resultSize = library.getBooks().size();

            if (initSize != resultSize) {
                libraryDAO.save(library);
            }

        } catch (DAOException e) {
            throw new LogicException(e);
        }

    }

    @Override
    public List<Book> find(String author, Book.SortType type) throws LogicException {

        try {

            DAOProvider factory = DAOProvider.getInstance();
            LibraryCreatorDAO libraryDAO = factory.getLibraryCreatorDAO();

            Library library = libraryDAO.create();
            List<Book> results = new ArrayList<Book>();

            for (Book book : library.getBooks()) {
                if (book.getAuthor().equals(author)) {
                    results.add(book);
                }
            }

            if (type == Book.SortType.BY_PRICE) {
                Collections.sort(results, new BookByPriceComparator());
            } else if (type == Book.SortType.BY_YEAR_PUBLISHED) {
                Collections.sort(results, new BookByYearComparator());
            }

            return results;
        } catch (DAOException e) {
            throw new LogicException(e);
        }
    }

    @Override
    public List<Book> returnAllBooks() throws LogicException {

        try {

            DAOProvider factory = DAOProvider.getInstance();
            LibraryCreatorDAO libraryDAO = factory.getLibraryCreatorDAO();

            Library library = libraryDAO.create();
            return library.getBooks();

        } catch (DAOException e) {
            throw new LogicException(e);
        }
    }
}
