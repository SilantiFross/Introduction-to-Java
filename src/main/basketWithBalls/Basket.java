package main.basketWithBalls;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by silan on 25.09.2016.
 */
public class Basket {

    private ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball newBall) {
        balls.add(newBall);
    }

    public int getWeightOfBalls() {
        int weightOfBalls = 0;
        for (Ball ball : balls) {
            weightOfBalls += ball.getWeight();
        }
        return weightOfBalls;
    }

    public int getNumberOfBallsWithColor(Color color) {
        int numberOfBallsWithColor = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                numberOfBallsWithColor++;
            }
        }
        return numberOfBallsWithColor;
    }
}
