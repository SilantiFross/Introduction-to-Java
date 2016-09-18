package test;

import main.coordinateSystem.CoordinateSystem;
import main.coordinateSystem.Point;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silan on 08.09.2016.
 */
public class CoordinateSystemTest {

    @Test
    public void checkPointInTopArea() throws Exception {
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(-2, 3)));
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(3, 3)));
    }

    @Test
    public void checkPointInBotArea() throws Exception {
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(-1, -1)));
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(2, -3)));
    }

    @Test
    public void checkPointBetweenAreas() throws Exception {
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(0, 0)));
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(3, 0)));
    }

    @Test
    public void checkPointOnBorder() throws Exception {
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(4, 1)));
        Assert.assertTrue(CoordinateSystem.isPointIncluded(new Point(6, -2)));
    }

    @Test
    public void checkPointOutsideAreas() throws Exception {
        Assert.assertFalse(CoordinateSystem.isPointIncluded(new Point(-7, 1)));
    }

}