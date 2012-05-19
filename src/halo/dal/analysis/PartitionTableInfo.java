package halo.dal.analysis;

import java.util.HashMap;
import java.util.Map;

/**
 * 解析器返回的解析结果
 * 
 * @author akwei
 */
public class PartitionTableInfo {

    private final Map<String, String> logic_realMap = new HashMap<String, String>();

    /**
     * 数据源key.
     */
    private String dsName;

    public String getDsName() {
        return dsName;
    }

    /**
     * set数据源key
     * 
     * @param dsName
     *            数据源key
     */
    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    /**
     * 设置逻辑表与真实表的对应
     * 
     * @param logic
     *            逻辑表
     * @param real
     *            真实表
     */
    public void setRealTable(String logic, String real) {
        logic_realMap.put(logic, real);
    }

    /**
     * 通过逻辑表获得真实表
     * 
     * @param logic
     *            逻辑表
     * @return
     */
    public String getRealTable(String logic) {
        return logic_realMap.get(logic);
    }
}