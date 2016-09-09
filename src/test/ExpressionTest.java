package test;

import main.Expression.Expression;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by silan on 08.09.2016.
 */
public class ExpressionTest {

    @Test
    public void getAnswer() throws Exception {
        Expression expression = new Expression(0, 0);
        double result = expression.getAnswer();
        Assert.assertTrue("Result != " + result, result == 0.5);
    }
}