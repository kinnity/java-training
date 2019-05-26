package by.epam.training.unit13ht.task03.logic.comparator;

import by.epam.training.unit13ht.task03.entity.Book;

import java.util.Comparator;

public class BookByYearComparator implements Comparator<Book> {

    @Override
    public int compare(Book object1, Book object2) {
        if (object1.getYearPublished() > object2.getYearPublished()) {
            return 1;
        } else if (object1.getYearPublished() == object2.getYearPublished()) {
            return 0;
        } else {
            return -1;
        }
    }
}
