package main;

import main.coordinateSystem.CoordinateSystem;
import main.expression.Expression;
import main.coordinateSystem.Point;
import main.tableOfTangents.TableOfTangents;

public class Main {

    public static void main(String[] args) {
        Expression expression = new Expression(0, 0);
        System.out.println("Answer: " + expression.getAnswer());

        Point point = new Point(3, 1);
        System.out.println(CoordinateSystem.isPointIncluded(point));

        TableOfTangents tableOfTangents = new TableOfTangents(0, 180, 15);
        System.out.println(tableOfTangents.toString());
    }
}
