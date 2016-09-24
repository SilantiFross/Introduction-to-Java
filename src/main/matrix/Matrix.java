package main.matrix;

/**
 * Created by silan on 24.09.2016.
 */
public final class Matrix {

    public static double[][] generate(double[] sequence) {
        double[][] matrix = new double[sequence.length][sequence.length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(sequence, i, matrix[i], 0, sequence.length - i);
            System.arraycopy(sequence, 0, matrix[i], sequence.length - i, i);
        }
        return matrix;
    }
}
