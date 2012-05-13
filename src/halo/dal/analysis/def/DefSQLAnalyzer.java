package halo.dal.analysis.def;

import halo.dal.analysis.SQLAnalyzerException;
import halo.dal.analysis.SQLInfo;
import halo.dal.analysis.SQLKeyErrException;
import halo.dal.analysis.SQLStruct;

import java.util.ArrayList;
import java.util.List;

public class DefSQLAnalyzer extends AbsSQLAnalyzer {

    private DefSelectSQLAnalyzer selectSQLAnalyzer = new DefSelectSQLAnalyzer();

    private DefDeleteSQLAnalyzer deleteSQLAnalyzer = new DefDeleteSQLAnalyzer();

    private DefUpdateSQLAnalyzer updateSQLAnalyzer = new DefUpdateSQLAnalyzer();

    private DefInsertSQLAnalyzer insertSQLAnalyzer = new DefInsertSQLAnalyzer();

    public SQLStruct parse(String sql) {
        if (sql.indexOf(" between ") != -1 || sql.indexOf(" BETWEEN ") != -1) {
            throw new SQLKeyErrException("not supported sql key: between ");
        }
        String _sql = sql.replaceAll("\\. {1,}", "\\.").trim();
        _sql = this.getLowerSQL(_sql);
        // 对于只运行数据库函数时，不需要解析
        if (_sql.startsWith(SQL_KEY_SELECT) && _sql.indexOf(" from ") == -1) {
            return null;
        }
        if (_sql.startsWith(SQL_KEY_SELECT)) {
            return this.selectSQLAnalyzer.parse(_sql);
        }
        else if (_sql.startsWith(SQL_KEY_INSERT_INTO)) {
            return this.insertSQLAnalyzer.parse(_sql);
        }
        else if (_sql.startsWith(SQL_KEY_UPDATE)) {
            return this.updateSQLAnalyzer.parse(_sql);
        }
        else if (_sql.startsWith(SQL_KEY_DELETE_FROM)) {
            return this.deleteSQLAnalyzer.parse(_sql);
        }
        else {
            throw new SQLAnalyzerException("unknown sql : " + sql);
        }
    }

    public SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values) {
        if (sql.indexOf(" between ") != -1 || sql.indexOf(" BETWEEN ") != -1) {
            throw new SQLKeyErrException("not supported sql key: between ");
        }
        String _sql = sql.replaceAll("\\. {1,}", "\\.").trim();
        _sql = this.getLowerSQL(_sql);
        if (_sql.startsWith(SQL_KEY_SELECT)) {
            return this.selectSQLAnalyzer.analyse(_sql, sqlStruct, values);
        }
        else if (_sql.startsWith(SQL_KEY_INSERT_INTO)) {
            return this.insertSQLAnalyzer.analyse(_sql, sqlStruct, values);
        }
        else if (_sql.startsWith(SQL_KEY_UPDATE)) {
            return this.updateSQLAnalyzer.analyse(_sql, sqlStruct, values);
        }
        else if (_sql.startsWith(SQL_KEY_DELETE_FROM)) {
            return this.deleteSQLAnalyzer.analyse(_sql, sqlStruct, values);
        }
        else {
            throw new SQLAnalyzerException("unknown sql : " + _sql);
        }
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
}