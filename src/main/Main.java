package main;

import main.basketWithBalls.Ball;
import main.basketWithBalls.Basket;
import main.coordinateSystem.CoordinateSystem;
import main.coordinateSystem.Point;
import main.expression.Expression;
import main.increasingSequence.IntegerTable;
import main.matrix.Matrix;
import main.overridingMethods.Book;
import main.overridingMethods.ProgrammerBook;
import main.primeNumbers.ArrayOfNumbers;
import main.sortShell.Sorter;
import main.tableOfTangents.TableOfTangents;
import main.twoSequence.Merger;

import java.awt.*;
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
        runEighthTask();
        runNinthTask();
        runTwelfthTask();
    }

    private static void runFirstTask() {
        Expression expression = new Expression(1, 3);
        System.out.println(String.format("1. %1$4.3f", expression.getAnswer()));
    }

    private static void runSecondTask() {
        System.out.println("2. " + CoordinateSystem.isPointIncluded(new Point(3, 1)));
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
        IntegerTable integerTable = new IntegerTable(new int[] {1, 3, 5, 123, 8, 12, 9});
        System.out.println("5. " + integerTable.getNumberOfUnnecessaryElements());
    }

    private static void runSixthTask() {
        double[][] matrix = Matrix.generate(new double[] {2.0, 5.0, 6.0});

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
        System.out.println();
    }

    private static void runEighthTask() {
        Merger merger = new Merger();
        int[] indicesOfElementsToInsert = merger.getObtainSpaceToInsert(new double[] {1, 3, 5, 7, 9, 11}, new double[] {2, 4, 6, 8,});
        System.out.println("\n8. ");
        for (int indexOfElementToInsert: indicesOfElementsToInsert) {
            System.out.print(indexOfElementToInsert + " ");
        }
        System.out.println();
    }

    private static void runNinthTask() {
        ArrayList<Ball> balls = new ArrayList<Ball>() {{
            add(new Ball(Color.red, 3));
            add(new Ball(Color.blue, 4));
            add(new Ball(Color.blue, 3));
        }};
        Basket basket = new Basket(balls);
        System.out.println("9. ");
        System.out.println("Weight of balls in basket: " + basket.getWeightOfBalls());
        System.out.println("Number of blue balls: " + basket.getNumberOfBallsWithColor(Color.blue));
    }

    private static void runTwelfthTask() {
        Book book = new Book("The Glass Bead Game", "Hermann Hesse", 10);
        ProgrammerBook programmerBook = new ProgrammerBook("Clean code", "Uncle Bob", 30, "Java", 3);
        book.setEdition(3);
        System.out.println("12. " + book.toString());
        System.out.println(programmerBook.toString());
    }
}
