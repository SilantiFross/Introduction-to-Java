package main;

import main.coordinateSystem.CoordinateSystem;
import main.coordinateSystem.Point;
import main.expression.Expression;
import main.increasingSequence.IntegerTable;
import main.matrix.Matrix;
import main.primeNumbers.ArrayOfNumbers;
import main.sortShell.Sorter;
import main.tableOfTangents.TableOfTangents;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
        runFourthTask();
        runFifthTask();
        runSixthTask();
        runSeventhTask();
    }

    private static void runFirstTask() {
        Expression expression = new Expression(1, 3);
        System.out.println(String.format("1. %1$4.3f", expression.getAnswer()));
    }

    private static void runSecondTask() {
        Point point = new Point(3, 1);
        System.out.println("2. " + CoordinateSystem.isPointIncluded(point));
    }

    private static void runThirdTask() {
        TableOfTangents tableOfTangents = new TableOfTangents(0, 180, 15);
        System.out.println("3.");
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

        System.out.println("4. ");
        for (int indexPrimeNumber : indicesOfPrimeNumbers) {
            System.out.println(indexPrimeNumber + " ");
        }
        System.out.println();
    }

    private static void runFifthTask() {
        int[] array = {1, 3, 5, 123, 8, 12, 9};
        IntegerTable integerTable = new IntegerTable(array);
        System.out.println("5. " + integerTable.getNumberOfUnnecessaryElements());
    }

    private static void runSixthTask() {
        double[] sequence = {2.0, 5.0, 6.0};
        double[][] matrix = Matrix.generate(sequence);

        System.out.println("6. ");
        for (double[] line : matrix) {
            for (int i = 0; i < matrix.length; i++)
                System.out.print(line[i] + " ");
            System.out.println();
        }
        System.out.println();
    }

    private static void runSeventhTask() {
        double[] array = {12.0, 123124.0, 5634.5, 5634.4, 1.2, 6.4, 123.5, 67856.8};
        Sorter.sortShell(array);
        System.out.println("7. ");
        for (double value : array) {
            System.out.print(value + " ");
        }
    }
}
