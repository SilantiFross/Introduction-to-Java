package main.overridingMethods;

import java.util.Objects;

/**
 * Created by silan on 25.09.2016.
 */
public class Book implements Comparable<Book> {

    private static int edition;
    private String title;
    private String author;
    private int price;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void setEdition(int value) {
        edition = value;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: '" + title + "', Author: '" + author + "', Price: '" + price + "', ISBN: '" + isbn +
                "', Edition: '" + edition + "'";
    }

    @Override
    public int hashCode() {
        return title.hashCode() * 11 + author.hashCode() * 61 + price * 47;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        if (price != book.price) {
            return false;
        }
        if (null == title) {
            return (Objects.equals(null, book.title));
        } else {
            if (!title.equals(book.title)) {
                return false;
            }
        }
        if (null == author) {
            return (Objects.equals(null, book.author));
        } else {
            if (!author.equals(book.author)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Book clone() {
        return new Book(title, author, price, isbn);
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.isbn);
    }
}
