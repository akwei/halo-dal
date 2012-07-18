package halo.dal.analysis.antlr.v3;

import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.ParsedTableInfo;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLInfo;
import halo.dal.analysis.SQLKeyErrException;
import halo.dal.analysis.SQLStruct;
import halo.dal.analysis.antlr.AntlrParserDelegate;
import halo.dal.analysis.antlr.ColExpr;
import halo.dal.analysis.antlr.DefAntlrParserDelegate;
import halo.dal.analysis.antlr.SQLInfoImpl;
import halo.dal.analysis.antlr.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.lang3.StringUtils;

public class AntlrV3SQLAnalyzer implements SQLAnalyzer {

    protected final static String SQL_BLANK = " ";

    protected final static String SQL_KEY_SELECT = "select ";

    protected final static String SQL_KEY_SELECT_ = "SELECT ";

    public SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values,
            Map<String, Object> context) {
        SQLInfoImpl info = new SQLInfoImpl();
        SQLExpression sqlExpression;
        int i = 0;
        for (ColumnExper o : sqlStruct.getColumnExpers()) {
            sqlExpression = new SQLExpression();
            sqlExpression.setColumn(o.getColumn());
            sqlExpression.setSqlExpressionSymbol(o.getSqlExpressionSymbol());
            sqlExpression.setValue(values[i]);
            info.addSQLExpression(o.getLogicTableName(), sqlExpression);
            i++;
        }
        return info;
    }

    public SQLStruct parse(String sql, Map<String, Object> context) {
        if (sql.indexOf(" between ") != -1 || sql.indexOf(" BETWEEN ") != -1) {
            throw new SQLKeyErrException("not supported sql key: between ");
        }
        String _sql = sql.replaceAll("\\. {1,}", "\\.").trim();
        // 对于只运行数据库函数时，不需要解析
        SQLStruct sqlStruct = new SQLStruct();
        if (_sql.startsWith(SQL_KEY_SELECT) || _sql.startsWith(SQL_KEY_SELECT_)) {
            if (_sql.indexOf(" from ") == -1 && _sql.indexOf(" FROM ") == -1) {
                sqlStruct.setCanParse(false);
                return sqlStruct;
            }
        }
        sqlStruct.setCanParse(true);
        AntlrV3SQLLexer lexer = new AntlrV3SQLLexer(new ANTLRStringStream(_sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrV3SQLParser parser = new AntlrV3SQLParser(tokens);
        AntlrParserDelegate delegate = new DefAntlrParserDelegate();
        parser.setAntlrParserDelegate(delegate);
        try {
            parser.start();
        }
        catch (RecognitionException e) {
            throw new RuntimeException(e);
        }
        Table table;
        for (int i = 0; i < delegate.getTables().size(); i++) {
            table = delegate.getTables().get(i);
            sqlStruct.addTable(table.getName(), table.getAlias());
        }
        ColumnExper columnExper;
        for (ColExpr colExpr : delegate.getColExprs()) {
            columnExper = new ColumnExper();
            columnExper.setColumn(colExpr.getColumn());
            columnExper.setSqlExpressionSymbol(colExpr.getOp());
            sqlStruct.addColumnExper(columnExper);
        }
        return sqlStruct;
    }

    public String outPutSQL(String sql, SQLStruct sqlStruct, SQLInfo sqlInfo,
            ParsedTableInfo parsedTableInfo) {
        List<String> list = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        String realTableName;
        for (String tableName : sqlStruct.getTableNames()) {
            realTableName = parsedTableInfo.getRealTable(tableName);
            if (realTableName != null) {
                String alias = sqlStruct.getAliasByTableName(tableName);
                boolean isSame = alias != null && alias.endsWith(tableName);
                if (!isSame) {
                    list.add(SQL_BLANK + tableName + ".");
                    newList.add(SQL_BLANK + realTableName + ".");
                }
                list.add(SQL_BLANK + tableName + SQL_BLANK);
                newList.add(SQL_BLANK + realTableName + SQL_BLANK);
                list.add(SQL_BLANK + tableName + "(");
                newList.add(" " + realTableName + "(");
                list.add("," + tableName + SQL_BLANK);
                newList.add("," + realTableName + SQL_BLANK);
            }
        }
        String _sql = StringUtils.replaceEach(sql,
                list.toArray(new String[list.size()]),
                newList.toArray(new String[newList.size()]));
        // 解决sql结束字符串为表名，无法解析的问题例如 delete form user
        String str;
        for (String tableName : sqlStruct.getTableNames()) {
            realTableName = parsedTableInfo.getRealTable(tableName);
            if (realTableName != null) {
                str = SQL_BLANK + tableName;
                int idx = _sql.lastIndexOf(str);
                if (idx == -1) {
                    continue;
                }
                if (_sql.substring(idx).equals(str)) {
                    _sql = _sql.substring(0, idx) + SQL_BLANK + realTableName;
                }
            }
        }
        return _sql;
    }
}
