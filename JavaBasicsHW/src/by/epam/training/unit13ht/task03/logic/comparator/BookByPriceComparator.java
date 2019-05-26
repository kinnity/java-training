package by.epam.training.unit13ht.task03.logic.comparator;

import by.epam.training.unit13ht.task03.entity.Book;

import java.util.Comparator;

public class BookByPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book object1, Book object2) {
        return object1.getPrice().compareTo(object2.getPrice());
    }
}
