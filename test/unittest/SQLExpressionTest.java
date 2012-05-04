package unittest;

import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import junit.framework.Assert;

import org.junit.Test;

public class SQLExpressionTest {

    @Test
    public void create() {
        // =
        String sqlSeg = "name=?";
        Object value = 5;
        SQLExpression sqlExpression = new SQLExpression(sqlSeg, value);
        Assert.assertEquals(sqlExpression.getColumn(), "name");
        Assert.assertEquals(sqlExpression.getValue(), value);
        Assert.assertEquals(sqlExpression.getSqlExpressionSymbol(),
                SQLExpressionSymbol.EQUAL);
        // >=
        sqlSeg = "name>=?";
        sqlExpression = new SQLExpression(sqlSeg, value);
        Assert.assertEquals(sqlExpression.getColumn(), "name");
        Assert.assertEquals(sqlExpression.getValue(), value);
        Assert.assertEquals(sqlExpression.getSqlExpressionSymbol(),
                SQLExpressionSymbol.BIGGER_EQUAL);
        // <=
        sqlSeg = "name<=?";
        sqlExpression = new SQLExpression(sqlSeg, value);
        Assert.assertEquals(sqlExpression.getColumn(), "name");
        Assert.assertEquals(sqlExpression.getValue(), value);
        Assert.assertEquals(sqlExpression.getSqlExpressionSymbol(),
                SQLExpressionSymbol.SMALLER_EQUAL);
        // >
        sqlSeg = "name>?";
        sqlExpression = new SQLExpression(sqlSeg, value);
        Assert.assertEquals(sqlExpression.getColumn(), "name");
        Assert.assertEquals(sqlExpression.getValue(), value);
        Assert.assertEquals(sqlExpression.getSqlExpressionSymbol(),
                SQLExpressionSymbol.BIGGER);
        // <
        sqlSeg = "name<?";
        sqlExpression = new SQLExpression(sqlSeg, value);
        Assert.assertEquals(sqlExpression.getColumn(), "name");
        Assert.assertEquals(sqlExpression.getValue(), value);
        Assert.assertEquals(sqlExpression.getSqlExpressionSymbol(),
                SQLExpressionSymbol.SMALLER);
    }
}
