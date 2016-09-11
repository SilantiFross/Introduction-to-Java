package main.coordinateSystem;

/**
 * Created by silan on 08.09.2016.
 */
public final class CoordinateSystem {

    private static ShadedArea topShadedArea = new ShadedArea(-4, 5, 4, 0);
    private static ShadedArea botShadedArea = new ShadedArea(-6, 0, 6, -3);

    private CoordinateSystem() {}

    public static boolean isPointIncluded(Point point) {
        boolean topIncluded = topShadedArea.isPointIncluded(point);
        boolean botIncluded = botShadedArea.isPointIncluded(point);

        return topIncluded || botIncluded;
    }
}
