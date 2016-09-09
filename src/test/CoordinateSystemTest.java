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
    public void checkPointInFirstQuarter() throws Exception {
        boolean answer = CoordinateSystem.isPointIncluded(new Point(3, 1));
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInSecondQuarter() throws Exception {
        boolean answer = CoordinateSystem.isPointIncluded(new Point(-3, 0));
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInThirdQuarter() throws Exception {
        boolean answer = CoordinateSystem.isPointIncluded(new Point(-3, 1));
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInFourthQuarter() throws Exception {
        boolean answer = CoordinateSystem.isPointIncluded(new Point(6, -1));
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkIncomingPoint() throws Exception {
        boolean answer = CoordinateSystem.isPointIncluded(new Point(-100, 20));
        Assert.assertFalse("Not correct!", answer);
    }

}