package halo.dal.analysis.antlr;

public class ColExpr {

    private String column;

    private String op;

    public ColExpr() {
    }

    public ColExpr(String column, String op) {
        this.column = column;
        this.op = op;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
