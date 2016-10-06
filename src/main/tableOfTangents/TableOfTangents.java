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

    private void fillingTheTable(int lowerLimit, int upperLimit, float step) {
        for (float i = lowerLimit; i <= upperLimit; i += step) {
            tangentFunction.put(i, Math.tan(i));
        }
    }
}