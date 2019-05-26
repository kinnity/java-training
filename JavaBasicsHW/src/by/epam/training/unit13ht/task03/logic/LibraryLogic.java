package by.epam.training.unit13ht.task03.logic;

import by.epam.training.unit13ht.task03.entity.Book;
import by.epam.training.unit13ht.task03.entity.Book.SortType;
import by.epam.training.unit13ht.task03.exception.LogicException;

import java.util.List;

public interface LibraryLogic {

    void add(Book book) throws LogicException;

    void remove(Book book) throws LogicException;

    List<Book> find(String author, SortType type) throws LogicException;

    List<Book> returnAllBooks() throws LogicException;
}
