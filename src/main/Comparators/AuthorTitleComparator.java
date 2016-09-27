package main.Comparators;

import main.overridingMethods.Book;

import java.util.Comparator;

/**
 * Created by silan on 27.09.2016.
 */
public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int resultAuthorCompare = new AuthorComparator().compare(firstBook, secondBook);

        if (resultAuthorCompare == 0) {
            return new TitleComparator().compare(firstBook, secondBook);
        }

        return resultAuthorCompare;
    }
}
