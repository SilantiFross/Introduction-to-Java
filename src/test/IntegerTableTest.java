package test;

import main.increasingSequence.IntegerTable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by silan on 24.09.2016.
 */
public class IntegerTableTest {

    @Test
    public void checkIncreasingSequence() {
        int[] testArray = {1, 4, 6, 3, 8, 2, 10}; // {1, 4, 6, 8, 10} del: {4, 3}
        IntegerTable integerTable = new IntegerTable(testArray);
        Assert.assertEquals(2, integerTable.getNumberOfUnnecessaryElements());
    }
}