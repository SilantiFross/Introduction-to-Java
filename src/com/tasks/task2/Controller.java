package com.tasks.task2;

/**
 * Created by silan on 08.09.2016.
 */
public class Controller {

    private Point point;
    private CoordinateSystem coordinateSystem;

    public Controller(float x, float y) {
        this.point = new Point(x, y);
        coordinateSystem = new CoordinateSystem();
    }

    public boolean checkPointIncluded() {
        return coordinateSystem.isPointIncluded(point);
    }

}
