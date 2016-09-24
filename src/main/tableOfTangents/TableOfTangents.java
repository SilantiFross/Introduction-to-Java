package main.tableOfTangents;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by silan on 09.09.2016.
 */
public class TableOfTangents {

    private Map<Float, Double> tangentFunction;

    public TableOfTangents(int lowerLimit, int upperLimit, float step) {
        this.tangentFunction = new TreeMap<>();
        fillingTheTable(lowerLimit, upperLimit, step);
    }

    public Map<Float, Double> getTable() {
        return tangentFunction;
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry entry : tangentFunction.entrySet()) {
            result += String.format("%1$5.1f| %2$6.3f", entry.getKey(), entry.getValue()) + System.lineSeparator();
        }
        return result;
    }

    private void fillingTheTable(int lowerLimit, int upperLimit, float step) {
        for (float i = lowerLimit; i <= upperLimit; i += step) {
            tangentFunction.put(i, Math.tan(i));
        }
    }
}