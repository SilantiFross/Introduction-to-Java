package test;

import main.overridingMethods.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by silan on 25.09.2016.
 */
public class SortBookTest {

    private boolean isSorted(ArrayList<Book> books)
    {
        for (int i = 1; i < books.size(); i++)
            if (books.get(i-1).compareTo(books.get(i)) > 0) return false;

        return true;
    }

    @Test
    public void checkSortBook() {
        ArrayList<Book> books = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            String isbn = "915-23-" + random.nextInt(100) + "-" + random.nextInt(1000);
            books.add(new Book("TestBook", "TestAuthor", 10, isbn));
        }
        Collections.sort(books);

        Assert.assertTrue(isSorted(books));
    }

}