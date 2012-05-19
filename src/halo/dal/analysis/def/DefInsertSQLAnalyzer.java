package halo.dal.analysis.def;

import halo.dal.DALRunTimeException;
import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLStruct;

import java.util.List;
import java.util.Map;

public class DefInsertSQLAnalyzer extends AbsSQLAnalyzer {

    public SQLStruct parse(String sql, Map<String, Object> context) {
        SQLStruct sqlStruct = new SQLStruct();
        sqlStruct.setCanParse(true);
        String insertIntoSeg = null;
        List<String> list = formatSQL(sql);
        for (String s : list) {
            if (s.startsWith(SQL_KEY_INSERT_INTO)) {
                insertIntoSeg = s;
            }
        }
        if (insertIntoSeg == null) {
            throw new DALRunTimeException("no insert sql");
        }
        sqlStruct.addTable(insertIntoSeg.substring(
                SQL_KEY_INSERT_INTO.length(),
                insertIntoSeg.indexOf(SQL_KEY_LEFT_PARENTHESIS)).trim());
        this.parseColumnExpers(sqlStruct, insertIntoSeg);
        return sqlStruct;
    }

    private void parseColumnExpers(SQLStruct sqlStruct, String insertIntoSeg) {
        if (insertIntoSeg != null) {
            String insertSeg = insertIntoSeg;
            int idxLeftParenthesis = insertSeg
                    .indexOf(SQL_KEY_LEFT_PARENTHESIS);
            int idxRightParenthesis = insertSeg
                    .indexOf(SQL_KEY_RIGHT_PARENTHESIS);
            String columns = insertSeg.substring(idxLeftParenthesis + 1,
                    idxRightParenthesis);
            String[] columnarr = columns.split(",");
            ColumnExper columnExper;
            String field;
            String logicTableName;
            for (int i = 0; i < columnarr.length; i++) {
                field = columnarr[i].trim();
                columnExper = new ColumnExper();
                logicTableName = this.parseLogicTableName(sqlStruct, field);
                columnExper.setColumn(field.toLowerCase());
                columnExper.setLogicTableName(logicTableName);
                columnExper.setSqlExpressionSymbol(SQLExpressionSymbol.EQUAL);
                sqlStruct.addColumnExper(columnExper);
            }
        }
    }
}
