package halo.dal.analysis.def;

import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;

import java.util.List;

public class DefInsertSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLInfo analyse(BasicSQLInfo sqlInfo, String lowerSQL,
            Object[] values) {
        this.parseSQLSegment(sqlInfo, lowerSQL);
        this.parseInsertTable(sqlInfo);
        this.parseSQLExpressions(sqlInfo, values);
        return sqlInfo;
    }

    private void parseInsertTable(BasicSQLInfo sqlInfo) {
        String insertIntoSeg = sqlInfo.getInsertIntoSQL();
        String table = insertIntoSeg.substring(SQL_KEY_INSERT_INTO.length(),
                insertIntoSeg.indexOf(SQL_KEY_LEFT_PARENTHESIS)).trim();
        sqlInfo.addTable(table);
    }

    private void parseSQLExpressions(BasicSQLInfo sqlInfo, Object[] values) {
        if (sqlInfo.getInsertIntoSQL() != null) {
            String insertSeg = sqlInfo.getInsertIntoSQL();
            int idxLeftParenthesis = insertSeg
                    .indexOf(SQL_KEY_LEFT_PARENTHESIS);
            int idxRightParenthesis = insertSeg
                    .indexOf(SQL_KEY_RIGHT_PARENTHESIS);
            String columns = insertSeg.substring(idxLeftParenthesis + 1,
                    idxRightParenthesis);
            String[] columnarr = columns.split(",");
            SQLExpression sqlExpression;
            String field;
            String logicTableName;
            for (int i = 0; i < columnarr.length; i++) {
                field = columnarr[i].trim();
                logicTableName = this.parseLogicTableName(sqlInfo, field);
                sqlExpression = new SQLExpression();
                sqlExpression.setColumn(field.toLowerCase());
                sqlExpression.setValue(values[i]);
                sqlExpression.setSqlExpressionSymbol(SQLExpressionSymbol.EQUAL);
                sqlInfo.addSQLExpression(logicTableName, sqlExpression);
            }
        }
    }

    private void parseSQLSegment(BasicSQLInfo sqlInfo, String sql) {
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_INSERT_INTO)) {
                sqlInfo.setInsertIntoSQL(s);
            }
        }
    }
}
