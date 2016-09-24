package test;

import main.matrix.Matrix;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by silan on 24.09.2016.
 */
public class MatrixTest {

    @Test
    public void checkMatrix() {
        double[] array = {2.0, 5.0, 6.0};
        double[][] expectedMatrix = {
                                    {2.0, 5.0, 6.0},
                                    {5.0, 6.0, 2.0},
                                    {6.0, 2.0, 5.0}
                                };
        Assert.assertArrayEquals(expectedMatrix, Matrix.generate(array));
    }

}