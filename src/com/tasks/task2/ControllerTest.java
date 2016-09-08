package com.tasks.task2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by silan on 08.09.2016.
 */
public class ControllerTest {
    @Test
    public void checkPointInFirstQuarter() throws Exception {
        Controller controller = new Controller(3, 1);
        boolean answer = controller.checkPointIncluded();
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInSecondQuarter() throws Exception {
        Controller controller = new Controller(-4, 0);
        boolean answer = controller.checkPointIncluded();
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInThirdQuarter() throws Exception {
        Controller controller = new Controller(-3, -1);
        boolean answer = controller.checkPointIncluded();
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkPointInFourthQuarter() throws Exception {
        Controller controller = new Controller(6, -1);
        boolean answer = controller.checkPointIncluded();
        Assert.assertTrue("Not correct!", answer);
    }

    @Test
    public void checkIncomingPoint() throws Exception {
        Controller controller = new Controller(-100, 20);
        boolean answer = controller.checkPointIncluded();
        Assert.assertFalse("Not correct!", answer);
    }

}