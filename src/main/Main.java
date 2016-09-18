package main;

import main.coordinateSystem.CoordinateSystem;
import main.expression.Expression;
import main.coordinateSystem.Point;
import main.tableOfTangents.TableOfTangents;

public class Main {

    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
        System.out.println(15 + Math.tan(15));
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
}
