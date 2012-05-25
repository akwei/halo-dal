package halo.dal.analysis.antlr;

public class ColExpr {

    private String column;

    private String op;

    public ColExpr() {
    }

    /**
     * @param column
     *            columnName不能含有"."
     * @param op
     */
    public ColExpr(String column, String op) {
        this.setColumn(column);
        this.setOp(op);
    }

    public String getColumn() {
        return column;
    }

    /**
     * @param column
     *            columnName不能含有"."
     */
    public void setColumn(String column) {
        int idx = column.indexOf(".");
        if (idx == -1) {
            this.column = column;
        }
        else {
            this.column = column.substring(idx + 1);
        }
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
