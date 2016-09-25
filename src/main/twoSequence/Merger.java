package main.twoSequence;

import java.util.Arrays;

/**
 * Created by silan on 25.09.2016.
 */
public class Merger {

    public int[] getObtainSpaceToInsert(double[] firstSequence, double[] secondSequence) {
        int[] indicesOfElementsToInsert = new int[secondSequence.length];

        for (int i = 0; i < secondSequence.length; i++) {
            int indexElementToInsert = Arrays.binarySearch(firstSequence, secondSequence[i]);
            indicesOfElementsToInsert[i] = (indexElementToInsert < 0) ? Math.abs(indexElementToInsert) - 1 : indexElementToInsert + 1;
        }

        return indicesOfElementsToInsert;
    }

}
