package halo.dal.rw;

import halo.dal.analysis.SQLExpression;

public interface RWSQLInfo {

    /**
     * 获得解析后的表名称
     * 
     * @return
     */
    String[] getTables();

    /**
     * 根据列名称获取列对应的表达式值
     * 
     * @param columnName
     *            列名格式为 logicTableName.columnName, 如果没有字段重合，可以直接使用columnName
     * @return
     */
    SQLExpression[] getSQLExpressions(String columnName);

    /**
     * 添加列所持有的表达式值
     * 
     * @param logicTableName
     *            逻辑表名称
     * @param sqlExpression
     */
    void addSQLExpression(String logicTableName, SQLExpression sqlExpression);
}