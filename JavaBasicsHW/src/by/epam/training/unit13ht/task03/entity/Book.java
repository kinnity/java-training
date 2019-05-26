package by.epam.training.unit13ht.task03.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private String publishingHouse;
    private int pageNumber;
    private BigDecimal price;

    public Book(String title, String author, int yearPublished, String publishingHouse, int pageNumber, BigDecimal price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.publishingHouse = publishingHouse;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished &&
                pageNumber == book.pageNumber &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished, publishingHouse, pageNumber, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", pageNumber=" + pageNumber +
                ", price=" + price +
                "}\n";
    }

    public enum SortType {
        BY_PRICE,
        BY_YEAR_PUBLISHED
    }
}
