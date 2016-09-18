package main.primeNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silan on 18.09.2016.
 */
public class ArrayOfNumbers {
    private List<Integer> numbers;

    public ArrayOfNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> getIndicesOfPrimeNumbers() {
        ArrayList<Integer> indicesOfPrimeNumbers = new ArrayList<>();
        for (int number: numbers)
            if (isPrime(number))
                indicesOfPrimeNumbers.add(numbers.indexOf(number));
        return indicesOfPrimeNumbers;
    }

    private boolean isPrime(int number) {
        if (number % 2 == 0 && number != 2) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
