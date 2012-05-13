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
     * @param sqlStruct
     * @param values
     *            sql中的参数值
     * @return 参考 {@link SQLInfo},如果sql语句是执行数据库函数时，不会进行解析。返回null
     */
    SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values);

    /**
     * 解析sql，获得需要的sql结构
     * 
     * @param sql
     * @return 参考 {@link SQLStruct}
     */
    SQLStruct parse(String sql);

    /**
     * 输出sql
     * 
     * @param sql
     * @param sqlInfo
     *            参考 {@link SQLInfo}
     * @param sqlStruct
     *            参考 {@link SQLStruct}
     * @param customInfo
     *            如果用户没有指定，此参数会赋值null
     * @return 新的sql语句
     */
    String outPutSQL(String sql, SQLInfo sqlInfo, SQLStruct sqlStruct,
            DALCustomInfo customInfo);
}