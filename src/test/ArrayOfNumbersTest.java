package test;

import main.primeNumbers.ArrayOfNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by silan on 18.09.2016.
 */
public class ArrayOfNumbersTest {

    @Test
    public void checkPrimeNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>() {{
            add(3);
            add(15);
            add(5);
            add(18);
        }};
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers(numbers);

        ArrayList<Integer> actualIndicesOfPrimeNumbers = arrayOfNumbers.getIndicesOfPrimeNumbers();
        ArrayList<Integer> expectedIndicesOfPrimeNumbers = new ArrayList<Integer>() {{
            add(0);
            add(2);
        }};

        Assert.assertEquals(expectedIndicesOfPrimeNumbers, actualIndicesOfPrimeNumbers);
    }
}