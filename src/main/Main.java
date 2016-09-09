package main;

import main.CoordinateSystem.CoordinateSystem;
import main.Expression.Expression;
import main.CoordinateSystem.Point;

public class Main {

    public static void main(String[] args) {
        Expression expression = new Expression(0, 0);
        System.out.println("Answer: " + expression.getAnswer());

        Point point = new Point(3, 1);
        System.out.println(CoordinateSystem.isPointIncluded(point));
    }
}
