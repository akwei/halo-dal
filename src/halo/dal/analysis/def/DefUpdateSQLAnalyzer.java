package halo.dal.analysis.def;

import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLInfo;

import java.util.List;

public class DefUpdateSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLInfo analyse(BasicSQLInfo sqlInfo, String lowerSQL,
            Object[] values) {
        this.parseSQLSegment(sqlInfo, lowerSQL);
        this.parseUpdateTable(sqlInfo);
        this.parseSQLExpressions(sqlInfo, values);
        return sqlInfo;
    }

    private void parseUpdateTable(BasicSQLInfo sqlInfo) {
        String table = sqlInfo.getUpdateSQL()
                .substring(SQL_KEY_UPDATE.length());
        sqlInfo.addTable(table);
    }

    private void parseSQLExpressions(BasicSQLInfo sqlInfo, Object[] values) {
        int beginIdx = 0;
        // update sql
        if (sqlInfo.getUpdateSetSQL() != null) {
            String exSeg = sqlInfo.getUpdateSetSQL().substring(
                    SQL_KEY_SET.length());
            String[] expressionSegs = exSeg.split(",");
            SQLExpression sqlExpression;
            String logicTableName;
            String seg;
            for (int i = 0; i < expressionSegs.length; i++) {
                beginIdx++;
                seg = expressionSegs[i].trim();
                logicTableName = this.parseLogicTableName(sqlInfo, seg);
                sqlExpression = new SQLExpression(seg, values[i]);
                sqlInfo.addSQLExpression(logicTableName, sqlExpression);
            }
        }
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

    private void parseSQLSegment(BasicSQLInfo sqlInfo, String sql) {
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_WHERE)) {
                sqlInfo.setWhereSQL(s);
            }
            else if (s.startsWith(SQL_KEY_UPDATE)) {
                sqlInfo.setUpdateSQL(s);
            }
            else if (s.startsWith(SQL_KEY_SET)) {
                sqlInfo.setUpdateSetSQL(s);
            }
        }
    }
}
