package test;

import main.expression.Expression;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silan on 08.09.2016.
 */
public class ExpressionTest {

    @Test
    public void checkAnswer() throws Exception {
        Expression expressionTest = new Expression(1, -1);
        Assert.assertEquals(expressionTest.getAnswer(), 1.5, 0.0001);
    }
}