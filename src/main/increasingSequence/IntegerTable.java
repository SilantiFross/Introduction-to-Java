package main.increasingSequence;

/**
 * Created by silan on 23.09.2016.
 */
public class IntegerTable {

    private int[] table;

    public IntegerTable(int[] table) {
        this.table = table;
    }

    public int getNumberOfUnnecessaryElements() {
        int[] lengthOfPossibleSequences = getInitializedArray(table.length);
        int maxSequenceLength = findMaxValue(countOptimizedSequenceValues(lengthOfPossibleSequences));
        return table.length - maxSequenceLength;
    }

    private int[] getInitializedArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++ )
            array[i] = 1;
        return array;
    }

    private int[] countOptimizedSequenceValues(int[] sequence) {
        for (int i = 1; i < table.length; i++ )
            for (int j = 0; j < i; j++ )
                if ( table[i] > table[j] && sequence[i] < sequence[j] + 1)
                    sequence[i] = sequence[j] + 1;
        return sequence;
    }

    private int findMaxValue(int[] array) {
        int max = 0;
        for (int element : array)
            if (element > max)
                max = element;
        return max;
    }
}
