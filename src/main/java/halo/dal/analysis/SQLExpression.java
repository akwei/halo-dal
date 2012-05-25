package halo.dal.analysis;

public class SQLExpression {

    private String column;

    private Object value;

    private SQLExpressionSymbol sqlExpressionSymbol;

    public SQLExpressionSymbol getSqlExpressionSymbol() {
        return sqlExpressionSymbol;
    }

    public void setSqlExpressionSymbol(SQLExpressionSymbol sqlExpressionSymbol) {
        this.sqlExpressionSymbol = sqlExpressionSymbol;
    }

    public String getColumn() {
        return column;
    }

    public Object getValue() {
        return value;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
