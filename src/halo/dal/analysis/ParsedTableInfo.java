package halo.dal.analysis;

import java.util.HashMap;
import java.util.Map;

/**
 * 解析后的表信息
 * 
 * @author akwei
 */
public class ParsedTableInfo {

    private final Map<String, String> logic_realMap = new HashMap<String, String>();

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