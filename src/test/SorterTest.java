package test;

import main.sortShell.Sorter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silan on 24.09.2016.
 */
public class SorterTest {

    @Test
    public void checkSortingShell() {
        double[] receivedArray = {12.0, 123124.0, 5634.5, 5634.4, 1.2, 6.4, 123.5, 67856.8};
        double[] expectedArray = {1.2, 6.4, 12.0, 123.5, 5634.4, 5634.5, 67856.8, 123124.0};

        Sorter.sortShell(receivedArray);

        Assert.assertArrayEquals(expectedArray, receivedArray, 0.0001);
    }
}