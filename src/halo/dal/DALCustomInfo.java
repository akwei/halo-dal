package halo.dal;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户自定义数据源与表信息
 * 
 * @author akwei
 */
public class DALCustomInfo {

    private String dsKey;

    private final Map<String, String> tableMap = new HashMap<String, String>();

    /**
     * 设置数据源
     * 
     * @param dsKey
     */
    public void setDsKey(String dsKey) {
        this.dsKey = dsKey;
    }

    /**
     * 获得数据源
     * 
     * @return
     */
    public String getDsKey() {
        return dsKey;
    }

    /**
     * 设置逻辑表与真实表的映射
     * 
     * @param logicTableName
     * @param realTableName
     */
    public void setRealTable(String logicTableName, String realTableName) {
        tableMap.put(logicTableName, realTableName);
    }

    /**
     * 获得真实表名
     * 
     * @param logicTableName
     * @return
     */
    public String getRealTableName(String logicTableName) {
        return tableMap.get(logicTableName);
    }
}