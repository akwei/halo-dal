package halo.dal.analysis.antlr;

import java.util.ArrayList;
import java.util.List;

public class DefAntlrParserDelegate implements AntlrParserDelegate {

    private List<Table> tables = new ArrayList<Table>();

    private List<ColExpr> colExprs = new ArrayList<ColExpr>();

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
