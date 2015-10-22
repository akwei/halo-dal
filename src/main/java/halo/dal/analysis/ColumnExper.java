package halo.dal.analysis;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ColumnExper {

    private String column;

    private String logicTableName;

    private SQLExpressionSymbol sqlExpressionSymbol;

    public static final String[] symbols = new String[] {//
    ">=",//
            "<=", //
            "<>",//
            "!=",//
            ">",//
            "<",//
            "=" ,//
            "=<",// 等价于 <=
            "in" // 等价于 =
    };

    public static final SQLExpressionSymbol[] symbolsEnum = new SQLExpressionSymbol[] {//
    SQLExpressionSymbol.BIGGER_EQUAL,//
            SQLExpressionSymbol.SMALLER_EQUAL, //
            SQLExpressionSymbol.NOT_EQUAL,//
            SQLExpressionSymbol.NOT_EQUAL2, //
            SQLExpressionSymbol.BIGGER,//
            SQLExpressionSymbol.SMALLER, //
            SQLExpressionSymbol.EQUAL, //
            SQLExpressionSymbol.SMALLER_EQUAL,//
            SQLExpressionSymbol.EQUAL,//
    };

    /**
     * 根据key=?的sql片段获取column，赋值相应的value.
     * 
     * @param sqlSeg
     * @param value
     */
    public ColumnExper(String logicTableName, String sqlSeg) {
        this.setLogicTableName(logicTableName);
        this.initWithSeg(sqlSeg);
    }

    public ColumnExper() {
    }

    public String getLogicTableName() {
        return logicTableName;
    }

    public void setLogicTableName(String logicTableName) {
        this.logicTableName = logicTableName;
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
                    this.setColumn(tmpName);
                }
                else {
                    this.setColumn(tmpName.substring(dotIdx + 1));
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

    public void setSqlExpressionSymbol(String symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(symbol)) {
                this.sqlExpressionSymbol = symbolsEnum[i];
                return;
            }
        }
        throw new SQLExceptionErrException("not value expression [ " + symbol
                + " ]");
    }

    public void setSqlExpressionSymbol(SQLExpressionSymbol sqlExpressionSymbol) {
        this.sqlExpressionSymbol = sqlExpressionSymbol;
    }

    public String getColumn() {
        return column;
    }

    /**
     * column只支持短名称，不支持tablename.column
     * 
     * @param column
     */
    public void setColumn(String column) {
        if (column != null) {
            this.column = column.toLowerCase().trim();
        }
        else {
            this.column = null;
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}