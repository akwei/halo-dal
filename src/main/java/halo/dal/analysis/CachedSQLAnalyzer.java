package halo.dal.analysis;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存模式的sql解析器<br>
 * <p>
 * 修改sql解析器缓存，改用ConcurrentHashMap，谢谢邓桥提出的修改建议
 * <p>
 * 
 * @author akwei
 * @author 邓桥
 */
public class CachedSQLAnalyzer implements SQLAnalyzer {

    private Map<String, SQLStruct> structMap = new ConcurrentHashMap<String, SQLStruct>();

    private SQLAnalyzer sqlAnalyzer;

    public CachedSQLAnalyzer(SQLAnalyzer sqlAnalyzer) {
        this.sqlAnalyzer = sqlAnalyzer;
    }

    public SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values,
            Map<String, Object> context) {
        return sqlAnalyzer.analyse(sql, sqlStruct, values, context);
    }

    public SQLStruct parse(String sql, Map<String, Object> context) {
        SQLStruct sqlStruct = this.getSQLStructFromCache(sql);
        if (sqlStruct == null) {
            sqlStruct = sqlAnalyzer.parse(sql, context);
            if (sqlStruct != null) {
                this.addSQLStructInCache(sql, sqlStruct);
            }
        }
        return sqlStruct;
    }

    public String outPutSQL(String sql, SQLStruct sqlStruct, SQLInfo sqlInfo,
            ParsedTableInfo parsedTableInfo) {
        return sqlAnalyzer.outPutSQL(sql, sqlStruct, sqlInfo, parsedTableInfo);
    }

    private SQLStruct getSQLStructFromCache(String sql) {
        return structMap.get(sql);
    }

    private void addSQLStructInCache(String sql, SQLStruct sqlStruct) {
        structMap.put(sql, sqlStruct);
    }
}
