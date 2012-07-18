package halo.dal.analysis.antlr;

import java.util.List;


public class MockAntlrParserDelegate implements AntlrParserDelegate {

    public void setSqlOp(int sqlOp) {
        // TODO Auto-generated method stub
    }

    public int getSqlOp() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void setHasSelectFrom(boolean hasSelectFrom) {
        // TODO Auto-generated method stub
    }

    public boolean isHasSelectFrom() {
        // TODO Auto-generated method stub
        return false;
    }

    public void setHasBetweenAnd(boolean hasBetweenAnd) {
        // TODO Auto-generated method stub
    }

    public boolean isHasBetweenAnd() {
        // TODO Auto-generated method stub
        return false;
    }

    public void onFindTable(String name, String alias) {
        // TODO Auto-generated method stub
    }

    public void onFindColExper(String column, String op) {
        // TODO Auto-generated method stub
    }

    public List<Table> getTables() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<ColExpr> getColExprs() {
        // TODO Auto-generated method stub
        return null;
    }
}
