package halo.dal.partition.analysis;

/**
 * sql分析器，负责解析sql，换取SQLInfo对象。创建新的sql
 * 
 * @author akwei
 */
public interface SQLAnalyzer {

    /**
     * 解析sql,获取 SQLInfo对象
     * 
     * @param sql
     *            sql语句
     * @param values
     *            sql中的参数值
     * @return 参考 {@link SQLInfo}
     */
    SQLInfo analyse(String sql, Object[] values);

    /**
     * 输出sql
     * 
     * @param sqlInfo
     *            参考 {@link SQLInfo}
     * @return 新的sql语句
     */
    String outPutSQL(SQLInfo sqlInfo);
}