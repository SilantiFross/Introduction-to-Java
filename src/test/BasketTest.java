package test;

import main.basketWithBalls.Ball;
import main.basketWithBalls.Basket;
import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by silan on 25.09.2016.
 */
public class BasketTest {

    @Test
    public void checkWeightBalls() {
        ArrayList<Ball> balls = new ArrayList<Ball>() {{
            add(new Ball(Color.blue, 2));
            add(new Ball(Color.black, 3));
            add(new Ball(Color.blue, 1));
        }};
        Basket basket = new Basket(balls);
        int expectedWeight = 6;

        Assert.assertEquals(expectedWeight, basket.getWeightOfBalls());
    }

    @Test
    public void checkNumberOfBlueBalls() {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.black, 2));
        basket.addBall(new Ball(Color.blue, 3));
        basket.addBall(new Ball(Color.blue, 12));
        basket.addBall(new Ball(Color.blue, 5));

        int expectedNumberOfBlueBalls = 3;

        Assert.assertEquals(expectedNumberOfBlueBalls, basket.getNumberOfBallsWithColor(Color.blue));
    }

}