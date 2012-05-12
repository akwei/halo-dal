package halo.dal.analysis.def;

import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLInfo;

import java.util.List;

public class DefSelectSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLInfo analyse(BasicSQLInfo sqlInfo, String lowerSQL,
            Object[] values) {
        this.parseSQLSegment(sqlInfo, lowerSQL);
        this.parseSelectTable(sqlInfo);
        this.parseSQLExpressions(sqlInfo, values);
        return sqlInfo;
    }

    private void parseSQLSegment(BasicSQLInfo sqlInfo, String sql) {
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_SELECT)) {
                sqlInfo.setSelectSQL(s);
            }
            else if (s.startsWith(SQL_KEY_LEFT_JOIN) || //
                    s.startsWith(SQL_KEY_RIGHT_JOIN) || //
                    s.startsWith(SQL_KEY_INNER_JOIN) || //
                    s.startsWith(SQL_KEY_FULL_JOIN) //
            ) {
                sqlInfo.setJoinSQL(s);
            }
            else if (s.startsWith(SQL_KEY_ON)) {
                sqlInfo.setJoinOnSQL(s);
            }
            else if (s.startsWith(SQL_KEY_WHERE)) {
                sqlInfo.setWhereSQL(s);
            }
            else if (s.startsWith(SQL_KEY_FROM)) {
                sqlInfo.addFromSQL(s);
            }
        }
    }

    private void parseSelectTable(BasicSQLInfo sqlInfo) {
        String tableNameSeg;
        for (String fromSQL : sqlInfo.getFromSQLs()) {
            tableNameSeg = fromSQL.substring(SQL_KEY_FROM.length());
            String[] tables = tableNameSeg.split(",");
            for (String table : tables) {
                sqlInfo.addTable(table.trim());
            }
            tableNameSeg = sqlInfo.getJoinSQL();
            int len = 0;
            if (tableNameSeg != null) {
                int idx = tableNameSeg.indexOf(SQL_KEY_FULL_JOIN);
                len = SQL_KEY_FULL_JOIN.length();
                if (idx == -1) {
                    idx = tableNameSeg.indexOf(SQL_KEY_INNER_JOIN);
                    len = SQL_KEY_INNER_JOIN.length();
                }
                if (idx == -1) {
                    idx = tableNameSeg.indexOf(SQL_KEY_LEFT_JOIN);
                    len = SQL_KEY_LEFT_JOIN.length();
                }
                if (idx == -1) {
                    idx = tableNameSeg.indexOf(SQL_KEY_RIGHT_JOIN);
                    len = SQL_KEY_RIGHT_JOIN.length();
                }
                String table = tableNameSeg.substring(idx + len).trim();
                sqlInfo.addTable(table);
            }
        }
    }

    private void parseSQLExpressions(BasicSQLInfo sqlInfo, Object[] values) {
        int beginIdx = 0;
        // where sql
        if (sqlInfo.getWhereSQL() != null) {
            String whereSQL = sqlInfo.getWhereSQL().replaceAll("\\(|\\)", "");
            String seg = whereSQL.substring(SQL_KEY_WHERE.length()).trim();
            String[] kv = seg.split("and|or");
            SQLExpression sqlExpression;
            int valueIdx = beginIdx;
            String logicTableName;
            String kvSeg;
            for (int i = 0; i < kv.length; i++) {
                if (kv[i].indexOf("?") == -1) {
                    continue;
                }
                if (!SQLExpression.isKeyValue(kv[i])) {
                    continue;
                }
                kvSeg = kv[i].trim();
                logicTableName = this.parseLogicTableName(sqlInfo, kvSeg);
                sqlExpression = new SQLExpression(kvSeg, values[valueIdx]);
                sqlInfo.addSQLExpression(logicTableName, sqlExpression);
                valueIdx++;
            }
        }
    }
}
