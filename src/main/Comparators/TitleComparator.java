package main.Comparators;

import main.overridingMethods.Book;

import java.util.Comparator;

/**
 * Created by silan on 27.09.2016.
 */
public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }
}
