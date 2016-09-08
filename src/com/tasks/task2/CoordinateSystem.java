package com.tasks.task2;

/**
 * Created by silan on 08.09.2016.
 */
public class CoordinateSystem {

    private ShadedArea topShadedArea;
    private ShadedArea botShadedArea;

    public CoordinateSystem() {
        this.topShadedArea = new ShadedArea(-4, 5, 4, 0);
        this.botShadedArea = new ShadedArea(-6, 0, 6, -3);
    }

    public boolean isPointIncluded(Point point) {
        boolean topIncluded = topShadedArea.isPointIncluded(point);
        boolean botIncluded = botShadedArea.isPointIncluded(point);

        return topIncluded || botIncluded;
    }
}
