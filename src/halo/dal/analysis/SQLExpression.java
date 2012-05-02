package halo.dal.analysis;

public class SQLExpression {

    private String column;

    private Object value;

    private SQLExpressionSymbol sqlExpressionSymbol;

    private static final String[] symbols = new String[] {//
    ">=",//
            "<=", //
            ">",//
            "<",//
            "=" //
    };

    private static final SQLExpressionSymbol[] symbolsEnum = new SQLExpressionSymbol[] {//
    SQLExpressionSymbol.BIGGER_EQUAL,//
            SQLExpressionSymbol.SMALLER_EQUAL, //
            SQLExpressionSymbol.BIGGER,//
            SQLExpressionSymbol.SMALLER, //
            SQLExpressionSymbol.EQUAL //
    };

    /**
     * 根据key=?的sql片段获取column，赋值相应的value
     * 
     * @param sqlSeg
     * @param value
     */
    public SQLExpression(String sqlSeg, Object value) {
        super();
        this.value = value;
        this.initWithSeg(sqlSeg);
    }

    public SQLExpression() {
    }

    public static boolean isKeyValue(String sqlSeg) {
        for (int i = 0; i < symbols.length; i++) {
            if (sqlSeg.indexOf(symbols[i]) != -1) {
                return true;
            }
        }
        return false;
    }

    private void initWithSeg(String sqlSeg) throws SQLExceptionErrException {
        int idx = -1;
        for (int i = 0; i < symbols.length; i++) {
            idx = sqlSeg.indexOf(symbols[i]);
            if (idx != -1) {
                this.sqlExpressionSymbol = symbolsEnum[i];
                String tmpName = sqlSeg.substring(0, idx);
                int dotIdx = tmpName.indexOf(".");
                if (dotIdx == -1) {
                    this.column = tmpName;
                }
                else {
                    this.column = tmpName.substring(dotIdx + 1);
                }
                break;
            }
        }
        if (idx == -1) {
            throw new SQLExceptionErrException("not value expression");
        }
    }

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
