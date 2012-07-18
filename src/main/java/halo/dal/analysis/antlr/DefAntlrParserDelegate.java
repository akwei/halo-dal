package halo.dal.analysis.antlr;

import java.util.ArrayList;
import java.util.List;

public class DefAntlrParserDelegate implements AntlrParserDelegate {

    private List<Table> tables = new ArrayList<Table>();

    private List<ColExpr> colExprs = new ArrayList<ColExpr>();

    private boolean hasBetweenAnd;

    private boolean hasSelectFrom;

    private int sqlOp;

    public void setSqlOp(int sqlOp) {
        this.sqlOp = sqlOp;
    }

    public int getSqlOp() {
        return sqlOp;
    }

    public boolean isHasBetweenAnd() {
        return this.hasBetweenAnd;
    }

    public boolean isHasSelectFrom() {
        return hasSelectFrom;
    }

    public void setHasSelectFrom(boolean hasSelectFrom) {
        this.hasSelectFrom = hasSelectFrom;
    }

    public void setHasBetweenAnd(boolean hasBetweenAnd) {
        this.hasBetweenAnd = hasBetweenAnd;
    }

    public void onFindTable(String name, String alias) {
        tables.add(new Table(name, alias));
    }

    public void onFindColExper(String column, String op) {
        colExprs.add(new ColExpr(column, op));
    }

    public List<ColExpr> getColExprs() {
        return colExprs;
    }

    public List<Table> getTables() {
        return tables;
    }
}