package com.tasks;

import com.tasks.task1.Expression;
import com.tasks.task2.Controller;

public class Main {

    public static void main(String[] args) {
        Expression expression = new Expression(0, 0);
        System.out.println("Answer: " + expression.getAnswer());

        Controller controller = new Controller(3, 1);
        System.out.println(controller.checkPointIncluded());
    }
}
