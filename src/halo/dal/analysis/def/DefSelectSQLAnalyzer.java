package halo.dal.analysis.def;

import halo.dal.DALRunTimeException;
import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLStruct;

import java.util.ArrayList;
import java.util.List;

public class DefSelectSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLStruct parse(String sql) {
        SQLStruct sqlStruct = new SQLStruct();
        String selectSQL = null;
        String joinSQL = null;
        String whereSQL = null;
        List<String> fromSQLs = new ArrayList<String>();
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_SELECT)) {
                selectSQL = s;
            }
            else if (s.startsWith(SQL_KEY_LEFT_JOIN) || //
                    s.startsWith(SQL_KEY_RIGHT_JOIN) || //
                    s.startsWith(SQL_KEY_INNER_JOIN) || //
                    s.startsWith(SQL_KEY_FULL_JOIN) //
            ) {
                joinSQL = s;
            }
            else if (s.startsWith(SQL_KEY_WHERE)) {
                whereSQL = s;
            }
            else if (s.startsWith(SQL_KEY_FROM)) {
                fromSQLs.add(s);
            }
        }
        if (selectSQL == null) {
            throw new DALRunTimeException("no select sql");
        }
        this.parseSelectTable(sqlStruct, fromSQLs, joinSQL);
        this.parseColumnExper(sqlStruct, whereSQL);
        return sqlStruct;
    }

    private void parseSelectTable(SQLStruct sqlStruct, List<String> fromSQLs,
            String joinSQL) {
        String tableNameSeg;
        for (String fromSQL : fromSQLs) {
            tableNameSeg = fromSQL.substring(SQL_KEY_FROM.length());
            String[] tables = tableNameSeg.split(",");
            for (String table : tables) {
                sqlStruct.addTable(table.trim());
            }
            tableNameSeg = joinSQL;
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
                sqlStruct.addTable(table);
            }
        }
    }

    private void parseColumnExper(SQLStruct sqlStruct, String whereSQL) {
        if (whereSQL != null) {
            String _whereSQL = whereSQL.replaceAll("\\(|\\)", "");
            String seg = _whereSQL.substring(SQL_KEY_WHERE.length()).trim();
            String[] kv = seg.split("and|or");
            ColumnExper columnExper;
            String kvSeg;
            for (int i = 0; i < kv.length; i++) {
                if (kv[i].indexOf("?") == -1) {
                    continue;
                }
                if (!SQLExpression.isKeyValue(kv[i])) {
                    continue;
                }
                kvSeg = kv[i].trim();
                columnExper = new ColumnExper(this.parseLogicTableName(
                        sqlStruct, kvSeg), kvSeg);
                sqlStruct.addColumnExper(columnExper);
            }
        }
    }
}
