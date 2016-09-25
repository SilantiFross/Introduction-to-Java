package main.basketWithBalls;

import java.awt.*;

/**
 * Created by silan on 25.09.2016.
 */
public class Ball {

    private Color color;
    private int weight;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
