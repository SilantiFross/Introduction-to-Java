package main;

import main.coordinateSystem.CoordinateSystem;
import main.coordinateSystem.Point;
import main.expression.Expression;
import main.primeNumbers.ArrayOfNumbers;
import main.tableOfTangents.TableOfTangents;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
        runFourthTask();
    }

    private static void runFirstTask() {
        Expression expression = new Expression(1, 3);
        System.out.println(String.format("%1$6.3f", expression.getAnswer()));
    }

    private static void runSecondTask() {
        Point point = new Point(3, 1);
        System.out.println(CoordinateSystem.isPointIncluded(point));
    }

    private static void runThirdTask() {
        TableOfTangents tableOfTangents = new TableOfTangents(0, 180, 15);
        System.out.println(tableOfTangents.toString());
    }

    private static void runFourthTask() {
        ArrayList<Integer> numbers = new ArrayList<Integer>() {{
            add(2);
            add(4);
            add(5);
            add(13);
            add(12);
        }};
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers(numbers);
        ArrayList<Integer> indicesOfPrimeNumbers = arrayOfNumbers.getIndicesOfPrimeNumbers();

        for (int indexPrimeNumber: indicesOfPrimeNumbers) {
            System.out.println(indexPrimeNumber + " ");
        }
    }
}
