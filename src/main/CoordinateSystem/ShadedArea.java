package main.coordinateSystem;

/**
 * Created by silan on 08.09.2016.
 */
public class ShadedArea {

    private Point topPointLimit;
    private Point botPointLimit;

    public ShadedArea(float topX, float topY, float botX, float botY) {
        topPointLimit = new Point(topX, topY);
        botPointLimit = new Point(botX, botY);
    }

    public boolean isPointIncluded(Point point) {
        float coordinateXPoint = point.getX();
        float coordinateYPoint = point.getY();

        return coordinateXPoint >= topPointLimit.getX() && coordinateXPoint <= botPointLimit.getX()
                && coordinateYPoint <= topPointLimit.getY() && coordinateYPoint >= botPointLimit.getY();

    }
}
