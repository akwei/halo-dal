package halo.dal.analysis.def;

import halo.dal.DALCustomInfo;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.analysis.SQLInfo;
import halo.dal.analysis.SQLStruct;

import java.util.HashMap;
import java.util.Map;

public class CachedSQLAnalyzer implements SQLAnalyzer {

    private Map<String, SQLStruct> structMap = new HashMap<String, SQLStruct>();

    private SQLAnalyzer sqlAnalyzer;

    public CachedSQLAnalyzer(SQLAnalyzer sqlAnalyzer) {
        this.sqlAnalyzer = sqlAnalyzer;
    }

    public SQLInfo analyse(String sql, SQLStruct sqlStruct, Object[] values,
            Map<String, Object> context) {
        return sqlAnalyzer.analyse(sql, sqlStruct, values, context);
    }

    public synchronized SQLStruct parse(String sql, Map<String, Object> context) {
        SQLStruct sqlStruct = this.getSQLStructFromCache(sql);
        if (sqlStruct == null) {
            sqlStruct = sqlAnalyzer.parse(sql, context);
            if (sqlStruct != null) {
                this.addSQLStructInCache(sql, sqlStruct);
            }
        }
        return sqlStruct;
    }

    public String outPutSQL(String sql, SQLInfo sqlInfo, SQLStruct sqlStruct,
            DALCustomInfo customInfo) {
        return sqlAnalyzer.outPutSQL(sql, sqlInfo, sqlStruct, customInfo);
    }

    private SQLStruct getSQLStructFromCache(String sql) {
        return structMap.get(sql);
    }

    private void addSQLStructInCache(String sql, SQLStruct sqlStruct) {
        structMap.put(sql, sqlStruct);
    }
}
