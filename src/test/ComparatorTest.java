package test;

import main.Comparators.AuthorTitleComparator;
import main.Comparators.AuthorTitlePriceComparator;
import main.Comparators.TitleAuthorComparator;
import main.Comparators.TitleComparator;
import main.overridingMethods.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by silan on 27.09.2016.
 */
public class ComparatorTest {

    private ArrayList<Book> testBooks = new ArrayList<Book>() {{
        add(new Book("CTitle", "BAuthor", 12, "3"));
        add(new Book("ATitle", "CAuthor", 13, "4"));
        add(new Book("ATitle", "AAuthor", 10, "1"));
        add(new Book("BTitle", "AAuthor", 11, "2"));
    }};

    @Test
    public void testSortedTitle() {
        Collections.sort(testBooks, new TitleComparator());
        Assert.assertTrue(isSortedTitle(testBooks));
    }

    @Test
    public void testSortedTitleAuthor() {
        Collections.sort(testBooks, new TitleAuthorComparator());
        Assert.assertTrue(isSortedTitleAuthor(testBooks));
    }

    @Test
    public void testSortedAuthorTitle() {
        Collections.sort(testBooks, new AuthorTitleComparator());
        Assert.assertTrue(isSortedAuthorTitle(testBooks));
    }

    @Test
    public void testSortedAuthorTitlePrice() {
        Collections.sort(testBooks, new AuthorTitlePriceComparator());
        Assert.assertTrue(isSortedAuthorTitlePrice(testBooks));
    }

    private boolean isSortedTitle(ArrayList<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            if (isInAscendingOrderTitle(books.get(i - 1), books.get(i)) > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isSortedTitleAuthor(ArrayList<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            if (isInAscendingOrderTitle(books.get(i - 1), books.get(i)) > 0) {
                return false;
            } else if ((isInAscendingOrderTitle(books.get(i - 1), books.get(i))) == 0) {
                if (isInAscendingOrderAuthor(books.get(i - 1), books.get(i)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSortedAuthorTitle(ArrayList<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            if (isInAscendingOrderAuthor(books.get(i - 1), books.get(i)) > 0) {
                return false;
            } else if ((isInAscendingOrderAuthor(books.get(i - 1), books.get(i))) == 0) {
                if (isInAscendingOrderTitle(books.get(i - 1), books.get(i)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSortedAuthorTitlePrice(ArrayList<Book> books) {
        for (int i = 1; i < books.size(); i++) {
            if (isInAscendingOrderAuthor(books.get(i - 1), books.get(i)) > 0) {
                return false;
            } else if ((isInAscendingOrderAuthor(books.get(i - 1), books.get(i))) == 0) {
                if (isInAscendingOrderTitle(books.get(i - 1), books.get(i)) > 0) {
                    return false;
                } else if (isInAscendingOrderPrice(books.get(i - 1), books.get(i)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private int isInAscendingOrderTitle(Book firstBook, Book secondBook) {
        return firstBook.getTitle().compareTo(secondBook.getTitle());
    }

    private int isInAscendingOrderAuthor(Book firstBook, Book secondBook) {
        return firstBook.getAuthor().compareTo(secondBook.getAuthor());
    }

    private int isInAscendingOrderPrice(Book firstBook, Book secondBook) {
        return firstBook.getPrice() - secondBook.getPrice();
    }

}
