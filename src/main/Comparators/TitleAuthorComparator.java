package main.Comparators;

import main.overridingMethods.Book;

import java.util.Comparator;

/**
 * Created by silan on 27.09.2016.
 */
public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int resultTitleCompare = new TitleComparator().compare(firstBook, secondBook);

        if (resultTitleCompare == 0) {
            return new AuthorComparator().compare(firstBook, secondBook);
        }

        return resultTitleCompare;
    }
}
