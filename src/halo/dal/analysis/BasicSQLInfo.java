package halo.dal.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicSQLInfo implements SQLInfo {

    private String originalSQL;

    private final List<String> tableNames = new ArrayList<String>(2);

    private final Map<String, String> realTableNameMap = new HashMap<String, String>();

    private Map<String, String> aliasTableNameMap = new HashMap<String, String>();

    private Map<String, String> tableNameAliasMap = new HashMap<String, String>();

    private Object[] values;

    private String whereSQL;

    private String selectSQL;

    private String fullJoinSQL;

    private List<String> fromSQLs = new ArrayList<String>(1);

    private String joinSQL;

    private String joinOnSQL;

    private String insertIntoSQL;

    private String deleteFromSQL;

    private String updateSQL;

    private String updateSetSQL;

    private final Map<String, SQLExpression[]> sqlExpressionMap = new HashMap<String, SQLExpression[]>();

    public BasicSQLInfo(String originalSQL, Object[] values) {
        super();
        this.originalSQL = originalSQL;
        this.values = values;
    }

    /**
     * @param table
     *            包括表名与别名的sql片段,例如 user as u,user u
     */
    public void addTable(String table) {
        String[] name_aliases;
        if (table.indexOf(" as ") != -1) {
            name_aliases = table.split(" as ");
        }
        else {
            name_aliases = table.split(" ");
        }
        if (name_aliases.length == 2) {
            this.addTable(name_aliases[0].trim(), name_aliases[1].trim());
        }
        else {
            this.addTable(name_aliases[0].trim(), null);
        }
    }

    public void addTable(String name, String alias) {
        tableNames.add(name);
        this.setRealTableName(name, name);
        if (alias != null) {
            aliasTableNameMap.put(alias, name);
            tableNameAliasMap.put(name, alias);
        }
    }

    public void addFromSQL(String fromSQL) {
        this.fromSQLs.add(fromSQL);
    }

    public String getAliasByTableName(String tableName) {
        return tableNameAliasMap.get(tableName);
    }

    public String getTableNameByAalias(String alias) {
        return aliasTableNameMap.get(alias);
    }

    /**
     * 忽略columnName大小写进行查询
     */
    public SQLExpression[] getSQLExpressions(String columnName) {
        String upperColumnName = columnName.toUpperCase();
        String lowerColumnName = columnName.toLowerCase();
        SQLExpression[] arr = sqlExpressionMap.get(columnName);
        SQLExpression[] lowerArr = sqlExpressionMap.get(lowerColumnName);
        SQLExpression[] upperArr = sqlExpressionMap.get(upperColumnName);
        int idx = columnName.indexOf(".");
        List<SQLExpression> list = new ArrayList<SQLExpression>();
        if (idx == -1) {
            if (arr != null) {
                for (SQLExpression e : arr) {
                    list.add(e);
                }
            }
            if (lowerArr != null) {
                for (SQLExpression e : lowerArr) {
                    list.add(e);
                }
            }
            if (upperArr != null) {
                for (SQLExpression e : upperArr) {
                    list.add(e);
                }
            }
            if (list.isEmpty()) {
                return null;
            }
            return list.toArray(new SQLExpression[list.size()]);
        }
        String subName = columnName.substring(idx + 1);
        SQLExpression[] arr1 = sqlExpressionMap.get(subName);
        SQLExpression[] lowerArr1 = sqlExpressionMap.get(subName.toLowerCase());
        SQLExpression[] upperArr1 = sqlExpressionMap.get(subName.toUpperCase());
        if (arr != null) {
            for (SQLExpression e : arr) {
                list.add(e);
            }
        }
        if (lowerArr != null) {
            for (SQLExpression e : lowerArr) {
                list.add(e);
            }
        }
        if (upperArr != null) {
            for (SQLExpression e : upperArr) {
                list.add(e);
            }
        }
        if (arr1 != null) {
            for (SQLExpression e : arr1) {
                list.add(e);
            }
        }
        if (lowerArr1 != null) {
            for (SQLExpression e : lowerArr1) {
                list.add(e);
            }
        }
        if (upperArr1 != null) {
            for (SQLExpression e : upperArr1) {
                list.add(e);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(new SQLExpression[list.size()]);
    }

    public void addSQLExpression(String logicTableName,
            SQLExpression sqlExpression) {
        SQLExpression[] sqlExpressions = this.getSQLExpressions(sqlExpression
                .getColumn());
        if (sqlExpressions == null) {
            sqlExpressions = new SQLExpression[] { sqlExpression };
        }
        else {
            int len = sqlExpressions.length + 1;
            SQLExpression[] temp = new SQLExpression[len];
            for (int i = 0; i < sqlExpressions.length; i++) {
                temp[i] = sqlExpressions[i];
            }
            temp[len - 1] = sqlExpression;
            sqlExpressions = temp;
        }
        if (logicTableName == null) {
            sqlExpressionMap.put(sqlExpression.getColumn(), sqlExpressions);
        }
        else {
            sqlExpressionMap.put(
                    logicTableName + "." + sqlExpression.getColumn(),
                    sqlExpressions);
        }
    }

    public String getFullJoinSQL() {
        return fullJoinSQL;
    }

    public void setFullJoinSQL(String fullJoinSQL) {
        this.fullJoinSQL = fullJoinSQL;
    }

    public void setJoinSQL(String joinSQL) {
        this.joinSQL = joinSQL;
    }

    public String getJoinSQL() {
        return joinSQL;
    }

    public String getJoinOnSQL() {
        return joinOnSQL;
    }

    public void setJoinOnSQL(String joinOnSQL) {
        this.joinOnSQL = joinOnSQL;
    }

    public String getInsertIntoSQL() {
        return insertIntoSQL;
    }

    public void setInsertIntoSQL(String insertIntoSQL) {
        this.insertIntoSQL = insertIntoSQL;
    }

    public String getDeleteFromSQL() {
        return deleteFromSQL;
    }

    public void setDeleteFromSQL(String deleteFromSQL) {
        this.deleteFromSQL = deleteFromSQL;
    }

    public void setSelectSQL(String selectSQL) {
        this.selectSQL = selectSQL;
    }

    public String getSelectSQL() {
        return selectSQL;
    }

    public String[] getTableNames() {
        return tableNames.toArray(new String[tableNames.size()]);
    }

    public Object[] getValues() {
        return values;
    }

    public String getWhereSQL() {
        return whereSQL;
    }

    public void setWhereSQL(String whereSQL) {
        this.whereSQL = whereSQL;
    }

    public String getOriginalSQL() {
        return originalSQL;
    }

    public void setOriginalSQL(String originalSQL) {
        this.originalSQL = originalSQL;
    }

    public void setUpdateSQL(String updateSQL) {
        this.updateSQL = updateSQL;
    }

    public String getUpdateSQL() {
        return updateSQL;
    }

    public String getUpdateSetSQL() {
        return updateSetSQL;
    }

    public void setUpdateSetSQL(String updateSetSQL) {
        this.updateSetSQL = updateSetSQL;
    }

    public List<String> getFromSQLs() {
        return fromSQLs;
    }

    public String[] getTables() {
        return this.tableNames.toArray(new String[this.tableNames.size()]);
    }

    public String getRealTableName(String logicTableName) {
        return realTableNameMap.get(logicTableName);
    }

    public void setRealTableName(String logicTableName, String realTableName) {
        realTableNameMap.put(logicTableName, realTableName);
    }
}
