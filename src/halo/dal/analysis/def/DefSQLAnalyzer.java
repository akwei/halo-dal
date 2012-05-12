package halo.dal.analysis.def;

import halo.dal.DALCustomInfo;
import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.analysis.SQLAnalyzerException;
import halo.dal.analysis.SQLInfo;
import halo.dal.analysis.SQLKeyErrException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class DefSQLAnalyzer extends AbsSQLAnalyzer implements SQLAnalyzer {

    private DefSelectSQLAnalyzer selectSQLAnalyzer = new DefSelectSQLAnalyzer();

    private DefDeleteSQLAnalyzer deleteSQLAnalyzer = new DefDeleteSQLAnalyzer();

    private DefUpdateSQLAnalyzer updateSQLAnalyzer = new DefUpdateSQLAnalyzer();

    private DefInsertSQLAnalyzer insertSQLAnalyzer = new DefInsertSQLAnalyzer();

    public String outPutSQL(SQLInfo sqlInfo, DALCustomInfo customInfo) {
        BasicSQLInfo info = (BasicSQLInfo) sqlInfo;
        if (customInfo != null) {
            for (String tableName : info.getTableNames()) {
                info.setRealTableName(tableName,
                        customInfo.getRealTableName(tableName));
            }
        }
        String sql = info.getOriginalSQL();
        List<String> list = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        for (String tableName : info.getTableNames()) {
            String alias = info.getAliasByTableName(tableName);
            boolean isSame = alias != null && alias.endsWith(tableName);
            if (!isSame) {
                list.add(SQL_BLANK + tableName + ".");
                newList.add(SQL_BLANK + info.getRealTableName(tableName) + ".");
            }
            list.add(SQL_BLANK + tableName + SQL_BLANK);
            newList.add(SQL_BLANK + info.getRealTableName(tableName)
                    + SQL_BLANK);
            list.add(SQL_BLANK + tableName + "(");
            newList.add(" " + info.getRealTableName(tableName) + "(");
            list.add("," + tableName + SQL_BLANK);
            newList.add("," + info.getRealTableName(tableName) + SQL_BLANK);
        }
        String _sql = StringUtils.replaceEach(sql,
                list.toArray(new String[list.size()]),
                newList.toArray(new String[newList.size()]));
        // 解决sql结束字符串为表名，无法解析的问题例如 delete form user
        String str;
        for (String tableName : info.getTableNames()) {
            str = SQL_BLANK + tableName;
            int idx = _sql.lastIndexOf(str);
            if (idx == -1) {
                continue;
            }
            if (_sql.substring(idx).equals(str)) {
                _sql = _sql.substring(0, idx) + SQL_BLANK
                        + info.getRealTableName(tableName);
            }
        }
        return _sql;
    }

    private String getLowerSQL(String sql) {
        String[] sqlWords = sql.split(SQL_BLANK);
        List<String> wordList = new ArrayList<String>();
        for (String word : sqlWords) {
            if (word.equals(SQL_BLANK)) {
                continue;
            }
            wordList.add(word);
        }
        StringBuilder sb = new StringBuilder();
        String lower;
        for (String word : wordList) {
            lower = word.toLowerCase();
            if (this.hasKey2(lower)) {
                sb.append(lower);
            }
            else {
                sb.append(word);
            }
            sb.append(SQL_BLANK);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public SQLInfo analyse(String sql, Object[] values) {
        String _sql = sql.replaceAll("\\. {1,}", "\\.").trim();
        String lowerSQL = this.getLowerSQL(_sql);
        // 对于只运行数据库函数时，不需要解析
        if (lowerSQL.startsWith(SQL_KEY_SELECT)
                && lowerSQL.indexOf(" from ") == -1) {
            return null;
        }
        if (sql.indexOf(" between ") != -1) {
            throw new SQLKeyErrException("not supported sql key: between ");
        }
        BasicSQLInfo sqlInfo = new BasicSQLInfo(_sql, values);
        if (lowerSQL.startsWith(SQL_KEY_SELECT)) {
            return this.selectSQLAnalyzer.analyse(sqlInfo, lowerSQL, values);
        }
        else if (lowerSQL.startsWith(SQL_KEY_INSERT_INTO)) {
            return this.insertSQLAnalyzer.analyse(sqlInfo, lowerSQL, values);
        }
        else if (lowerSQL.startsWith(SQL_KEY_UPDATE)) {
            return this.updateSQLAnalyzer.analyse(sqlInfo, lowerSQL, values);
        }
        else if (lowerSQL.startsWith(SQL_KEY_DELETE_FROM)) {
            return this.deleteSQLAnalyzer.analyse(sqlInfo, lowerSQL, values);
        }
        else {
            throw new SQLAnalyzerException("unknown sql : " + lowerSQL);
        }
    }
}