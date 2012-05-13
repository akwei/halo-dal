package halo.dal.analysis.def;

import halo.dal.DALRunTimeException;
import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLStruct;

import java.util.List;

public class DefUpdateSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLStruct parse(String sql) {
        SQLStruct sqlStruct = new SQLStruct();
        String whereSQL = null;
        String updateSQL = null;
        String updateSetSQL = null;
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_WHERE)) {
                whereSQL = s;
            }
            else if (s.startsWith(SQL_KEY_UPDATE)) {
                updateSQL = s;
            }
            else if (s.startsWith(SQL_KEY_SET)) {
                updateSetSQL = s;
            }
        }
        if (updateSQL == null || updateSetSQL == null) {
            throw new DALRunTimeException("no delete sql");
        }
        sqlStruct.addTable(updateSQL.substring(SQL_KEY_UPDATE.length()));
        this.parseColumnExpers(sqlStruct, updateSQL, updateSetSQL, whereSQL);
        return sqlStruct;
    }

    private void parseColumnExpers(SQLStruct sqlStruct, String updateSQL,
            String updateSetSQL, String whereSQL) {
        // update sql
        if (updateSQL != null) {
            String exSeg = updateSetSQL.substring(SQL_KEY_SET.length());
            String[] expressionSegs = exSeg.split(",");
            ColumnExper columnExper;
            String seg;
            for (int i = 0; i < expressionSegs.length; i++) {
                seg = expressionSegs[i].trim();
                columnExper = new ColumnExper(this.parseLogicTableName(
                        sqlStruct, seg), seg);
                sqlStruct.addColumnExper(columnExper);
            }
        }
        // where sql
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
