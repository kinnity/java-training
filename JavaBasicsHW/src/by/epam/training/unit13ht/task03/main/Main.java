package by.epam.training.unit13ht.task03.main;

import by.epam.training.unit13ht.task03.entity.Book;
import by.epam.training.unit13ht.task03.exception.LogicException;
import by.epam.training.unit13ht.task03.logic.LibraryLogic;
import by.epam.training.unit13ht.task03.logic.impl.LibraryLogicImpl;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            LibraryLogic logic = new LibraryLogicImpl();

            System.out.println("-- All records");
            print(logic.returnAllBooks());

            Book newBook = new Book("Гордость и предубеждение", "Джейн Остин", 2018, "Азбука", 416, BigDecimal.valueOf(9.44));

            System.out.println("-- adding new book");
            logic.add(newBook);
            print(logic.returnAllBooks());

            System.out.println("-- removing new book");
            logic.remove(newBook);
            print(logic.returnAllBooks());

            System.out.println("-- find Эндрю Таненбаум books, sorting by price");
            print(logic.find("Эндрю Таненбаум", Book.SortType.BY_PRICE));

            System.out.println("-- find Рэй Брэдбери books, sorting by year published");
            print(logic.find("Рэй Брэдбери", Book.SortType.BY_YEAR_PUBLISHED));

        } catch (LogicException e) {
            e.printStackTrace();
        }

    }

    public static void print(List<Book> books) {

        System.out.println(" --------------------------------------------------------------------------------------------------");
        for (Book book : books) {
            System.out.printf("|%-40s|%-25s|%-4d|%-10s|%-4d|%-10.2f|\n",
                    book.getTitle(), book.getAuthor(), book.getYearPublished(), book.getPublishingHouse(), book.getPageNumber(), book.getPrice());
        }
        System.out.println(" --------------------------------------------------------------------------------------------------");
    }

}
