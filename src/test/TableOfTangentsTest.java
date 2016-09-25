package test;

import main.tableOfTangents.TableOfTangents;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by silan on 18.09.2016.
 */
public class TableOfTangentsTest {

    @Test
    public void checkTableOfTangents() throws Exception {
        Map<Float, Double> expectedTestTable = new TreeMap<>();
        expectedTestTable.put(0.0f, 0.0);
        expectedTestTable.put(15f, -0.8559934009085188);

        TableOfTangents tableOfTangents = new TableOfTangents(0, 15, 15);
        Map<Float, Double> actualTable = tableOfTangents.getTable();

        Assert.assertEquals(expectedTestTable.entrySet(), actualTable.entrySet());
    }

}