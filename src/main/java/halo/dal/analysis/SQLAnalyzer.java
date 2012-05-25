package halo.dal.analysis;

import java.util.Map;

/**
 * sql分析器，负责解析sql，换取SQLInfo对象。创建新的sql
 * 
 * @author akwei
 */
public interface SQLAnalyzer {

    /**
     * 解析sql,获取 SQLInfo对象。
     * 
     * @param sql
     *            sql语句
     * @param sqlStruct
     *            通过parse解析后的结果,参考{@link SQLStruct}
     * @param values
     *            sql中的参数值
     * @param context
     *            用来传递自定义数据
     * @return 参考 {@link SQLInfo}
     */
    SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values,
            Map<String, Object> context);

    /**
     * 解析sql，获得需要的sql结构
     * 
     * @param sql
     * @param context
     *            用来传递自定义数据
     * @return 参考 {@link SQLStruct}
     */
    SQLStruct parse(String sql, Map<String, Object> context);

    /**
     * 输出最终sql。此结果将执行真正的数据库操作。sql中包含真正的表名称
     * 
     * @param sql
     * @param sqlStruct
     *            通过parse解析后的结果,参考{@link SQLStruct}
     * @param sqlInfo
     *            参考 {@link SQLInfo}
     * @param parsedTableInfo
     *            参考 {@link ParsedTableInfo}
     * @return 新的sql语句
     */
    String outPutSQL(String sql, SQLStruct sqlStruct, SQLInfo sqlInfo,
            ParsedTableInfo parsedTableInfo);
}