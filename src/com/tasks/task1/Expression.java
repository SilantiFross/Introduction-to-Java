package com.tasks.task1;

/**
 * Created by silan on 08.09.2016.
 */

public class Expression {

    private double x;
    private double y;

    public Expression(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getAnswer() {
        double answer = getNumerator() / getDenominator() + x;
        return answer;
    }

    private double getNumerator() {
        double numerator = Math.pow(Math.sin(this.x + this.y), 2) + 1;
        return numerator;
    }

    private double getDenominator() {
        double partDenominator = 1 + Math.pow(this.x, 2) * Math.pow(this.y, 2);
        double denominator = Math.abs(this.x - ((2 * this.x) / partDenominator)) + 2;
        return denominator;
    }
}
