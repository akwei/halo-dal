package halo.dal.analysis.def;

import halo.dal.DALCustomInfo;
import halo.dal.analysis.ColumnExper;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLInfo;
import halo.dal.analysis.SQLStruct;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public abstract class AbsSQLAnalyzer implements SQLAnalyzer {

    protected final static String SQL_KEY_LEFT_PARENTHESIS = "(";

    protected final static String SQL_KEY_RIGHT_PARENTHESIS = ")";

    protected final static String SQL_BLANK = " ";

    protected final static String SQL_KEY_SELECT = "select ";

    protected final static String SQL_KEY_LEFT_JOIN = "left join ";

    protected final static String SQL_KEY_RIGHT_JOIN = "rihgt join ";

    protected final static String SQL_KEY_FULL_JOIN = "full join ";

    protected final static String SQL_KEY_INNER_JOIN = "inner join ";

    protected final static String SQL_KEY_ON = "on ";

    protected final static String SQL_KEY_UPDATE = "update ";

    protected final static String SQL_KEY_SET = "set ";

    protected final static String SQL_KEY_WHERE = "where ";

    protected final static String SQL_KEY_FROM = "from ";

    protected final static String SQL_KEY_INSERT_INTO = "insert into ";

    protected final static String SQL_KEY_DELETE_FROM = "delete from ";

    protected final static String KEY_SELECT = "select";

    protected final static String KEY_INSERT = "insert";

    protected final static String KEY_UPDATE = "update";

    protected final static String KEY_DELETE = "delete";

    protected final static String KEY_INTO = "into";

    protected final static String KEY_FROM = "from";

    protected final static String KEY_FULL = "full";

    protected final static String KEY_JOIN = "join";

    protected final static String KEY_LEFT = "left";

    protected final static String KEY_RIGHT = "right";

    protected final static String KEY_INNER = "inner";

    protected final static String KEY_VALUES = "values";

    protected final static String KEY_SET = "set";

    protected final static String KEY_ON = "on";

    protected final static String KEY_WHERE = "where";

    protected final static String KEY_AS = "as";

    protected final static String KEY_AND = "and";

    protected final static String KEY_OR = "or";

    /**
     * 存储解析sql使用的sql关键字
     */
    private final static Set<String> keySet = new HashSet<String>();

    /**
     * 存储sql小写转换使用的sql关键字
     */
    private final static Set<String> keySet2 = new HashSet<String>();
    static {
        keySet.add(KEY_SELECT);
        keySet.add(KEY_FROM);
        keySet.add(KEY_FULL);
        keySet.add(KEY_INNER);
        keySet.add(KEY_LEFT);
        keySet.add(KEY_RIGHT);
        keySet.add(KEY_JOIN);
        keySet.add(KEY_ON);
        keySet.add(KEY_WHERE);
        keySet.add(KEY_DELETE);
        keySet.add(KEY_INSERT);
        keySet.add(KEY_UPDATE);
        keySet.add(KEY_INTO);
        keySet.add(KEY_VALUES);
        keySet.add(KEY_SET);
        //
        keySet2.add(KEY_SELECT);
        keySet2.add(KEY_FROM);
        keySet2.add(KEY_FULL);
        keySet2.add(KEY_INNER);
        keySet2.add(KEY_LEFT);
        keySet2.add(KEY_RIGHT);
        keySet2.add(KEY_JOIN);
        keySet2.add(KEY_ON);
        keySet2.add(KEY_WHERE);
        keySet2.add(KEY_DELETE);
        keySet2.add(KEY_INSERT);
        keySet2.add(KEY_UPDATE);
        keySet2.add(KEY_INTO);
        keySet2.add(KEY_VALUES);
        keySet2.add(KEY_SET);
        keySet2.add(KEY_AS);
        keySet2.add(KEY_AND);
        keySet2.add(KEY_OR);
    }

    /**
     * 格式化sql，输出为一个sql片段集合
     * 
     * @param sql
     * @return
     */
    protected List<String> formatSQL(String sql) {
        String[] sqlWords = sql.split(" ");
        List<String> wordList = new ArrayList<String>();
        for (String word : sqlWords) {
            if (word.equals(SQL_BLANK)) {
                continue;
            }
            wordList.add(word);
        }
        boolean onKey = false;
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        String word;
        for (int i = 0; i < wordList.size(); i++) {
            word = wordList.get(i);
            if (onKey) {
                onKey = hasKey(word);
                sb.append(word).append(SQL_BLANK);
            }
            else {
                if (hasKey(word)) {
                    onKey = true;
                    if (sb.length() > 0) {
                        list.add(sb.toString().trim());
                    }
                    sb.delete(0, sb.length());
                    sb.append(word).append(SQL_BLANK);
                }
                else {
                    sb.append(word).append(SQL_BLANK);
                    onKey = false;
                }
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString().trim());
        }
        return list;
    }

    protected boolean hasKey(String key) {
        return keySet.contains(key);
    }

    /**
     * 在小写转换时，判断是否含有sql关键字
     * 
     * @param key
     * @return true,含有
     */
    protected boolean hasKey2(String key) {
        return keySet2.contains(key);
    }

    protected String parseLogicTableName(SQLStruct sqlStruct, String columnSeg) {
        int idx = columnSeg.indexOf(".");
        if (idx == -1) {
            return null;
        }
        String alias = columnSeg.substring(0, idx);
        String logicTableName = sqlStruct.getTableNameByAalias(alias);
        if (logicTableName == null) {
            return alias;
        }
        return logicTableName;
    }

    public SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values) {
        BasicSQLInfo info = new BasicSQLInfo();
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

    public String outPutSQL(String sql, SQLInfo sqlInfo, SQLStruct sqlStruct,
            DALCustomInfo customInfo) {
        if (customInfo != null) {
            for (String tableName : sqlStruct.getTableNames()) {
                sqlInfo.setRealTable(tableName,
                        customInfo.getRealTable(tableName));
            }
        }
        List<String> list = new ArrayList<String>();
        List<String> newList = new ArrayList<String>();
        String realTableName;
        for (String tableName : sqlStruct.getTableNames()) {
            realTableName = sqlInfo.getRealTable(tableName);
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
            realTableName = sqlInfo.getRealTable(tableName);
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
