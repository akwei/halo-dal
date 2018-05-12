package halo.dal.analysis;

/**
 * @author akwei
 */
public interface SQLInfo {

    /**
     * 根据列名称获取列对应的表达式值
     * 
     * @param columnName
     *            列名格式为 logicTableName.columnName,不能是表的别名，必须是固定的logicTableName。
     *            如果没有字段重合，可以直接使用columnName
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

    /**
     * 获取操作类型 （读写分离的时候可以用）
     *
     * @return
     */
    SQLType getSQLType();

}