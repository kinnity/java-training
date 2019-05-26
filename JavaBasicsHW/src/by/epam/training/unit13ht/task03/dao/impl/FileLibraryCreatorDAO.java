package by.epam.training.unit13ht.task03.dao.impl;

import by.epam.training.unit13ht.task03.dao.LibraryCreatorDAO;
import by.epam.training.unit13ht.task03.entity.Book;
import by.epam.training.unit13ht.task03.entity.Library;
import by.epam.training.unit13ht.task03.exception.DAOException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class FileLibraryCreatorDAO implements LibraryCreatorDAO {

    private final static String FILE_PATH = "resources/books.txt";

    @Override
    public Library create() throws DAOException {

        try {

            Library library = new Library();

            Scanner fileScanner = new Scanner(new File(FILE_PATH));

            String string;

            while (fileScanner.hasNextLine()) {

                string = fileScanner.nextLine();

                Scanner lineScanner = new Scanner(string);
                lineScanner.useDelimiter("\\|");
                if (lineScanner.hasNext()) {

                    String title = lineScanner.next();
                    String author = lineScanner.next();
                    int yearPublished = lineScanner.nextInt();
                    String publishingHouse = lineScanner.next();
                    int pageNumber = lineScanner.nextInt();
                    BigDecimal price = lineScanner.nextBigDecimal();

                    Book book = new Book(title, author, yearPublished, publishingHouse, pageNumber, price);
                    library.add(book);

                }
            }
            return library;

        } catch (IOException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void save(Library library) throws DAOException {

        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {

            String text = "";

            for (Book book : library.getBooks()) {
                text += book.getTitle() + "|" +
                        book.getAuthor() + "|" +
                        book.getYearPublished() + "|" +
                        book.getPublishingHouse() + "|" +
                        book.getPageNumber() + "|" +
                        book.getPrice() + "\n";
            }

            byte[] buffer = text.getBytes();

            fileOutputStream.write(buffer, 0, buffer.length);

        } catch (IOException e) {
            throw new DAOException(e);
        }

    }
}
