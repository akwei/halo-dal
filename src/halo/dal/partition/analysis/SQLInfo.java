package halo.dal.partition.analysis;

/**
 * just declare interface
 * 
 * @author akwei
 */
public interface SQLInfo {

    /**
     * 获得原始sql
     * 
     * @return
     */
    String getOriginalSQL();

    /**
     * 添加真实表名称
     * 
     * @param logicTableName
     *            逻辑表名
     * @param realTableName
     *            真实表名
     */
    void setRealTableName(String logicTableName, String realTableName);

    /**
     * 根据逻辑表名获得真实表名
     * 
     * @param logicTableName
     *            逻辑表名
     * @return 真实表名
     */
    String getRealTableName(String logicTableName);

    /**
     * 获得解析后的表名称
     * 
     * @return
     */
    String[] getTables();

    /**
     * 根据列名称获取列对应的表达式值
     * 
     * @param column
     *            列名格式为 logicTableName.columnName
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