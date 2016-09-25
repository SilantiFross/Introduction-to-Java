package test;

import main.twoSequence.Merger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silan on 25.09.2016.
 */
public class MergerTest {

    @Test
    public void getObtainSpaceToInsert() throws Exception {
        double[] firstSequenceTest = {1, 2, 3, 6};
        double[] secondSequenceTest = {-8, 1, 4};
        int[] exceptedAnswer = {0, 1, 3};

        Merger merger = new Merger();
        int[] actualAnswer = merger.getObtainSpaceToInsert(firstSequenceTest, secondSequenceTest);

        Assert.assertArrayEquals(exceptedAnswer, actualAnswer);
    }

}