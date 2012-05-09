package halo.dal.analysis;

import halo.dal.DALCustomInfo;

/**
 * sql分析器，负责解析sql，换取SQLInfo对象。创建新的sql
 * 
 * @author akwei
 */
public interface SQLAnalyzer {

    /**
     * 解析sql,获取 SQLInfo对象。如果sql语句是执行数据库函数时，不会进行解析。返回null
     * 
     * @param sql
     *            sql语句
     * @param values
     *            sql中的参数值
     * @return 参考 {@link SQLInfo},如果sql语句是执行数据库函数时，不会进行解析。返回null
     */
    SQLInfo analyse(String sql, Object[] values);

    /**
     * 输出sql
     * 
     * @param sqlInfo
     *            参考 {@link SQLInfo}
     * @param customInfo
     *            如果用户没有指定，此参数会赋值null
     * @return 新的sql语句
     */
    String outPutSQL(SQLInfo sqlInfo, DALCustomInfo customInfo);
}