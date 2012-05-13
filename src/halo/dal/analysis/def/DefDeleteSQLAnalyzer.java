package halo.dal.analysis.def;

import halo.dal.DALRunTimeException;
import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLStruct;

import java.util.List;
import java.util.Map;

public class DefDeleteSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLStruct parse(String sql, Map<String, Object> context) {
        SQLStruct sqlStruct = new SQLStruct();
        String whereSQL = null;
        String deleteFromSQL = null;
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_WHERE)) {
                whereSQL = s;
            }
            else if (s.startsWith(SQL_KEY_DELETE_FROM)) {
                deleteFromSQL = s;
            }
        }
        if (deleteFromSQL == null) {
            throw new DALRunTimeException("no delete sql");
        }
        sqlStruct
                .addTable(deleteFromSQL.substring(SQL_KEY_DELETE_FROM.length()));
        this.parseColumnExper(sqlStruct, whereSQL);
        return sqlStruct;
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
