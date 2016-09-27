package main.Comparators;

import main.overridingMethods.Book;

import java.util.Comparator;

/**
 * Created by silan on 27.09.2016.
 */
public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int resultAuthorTitleCompare = new AuthorTitleComparator().compare(firstBook, secondBook);

        if (resultAuthorTitleCompare == 0) {
            return new PriceComparator().compare(firstBook, secondBook);
        }

        return resultAuthorTitleCompare;
    }
}
