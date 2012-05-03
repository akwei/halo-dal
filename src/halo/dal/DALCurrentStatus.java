package halo.dal;

import java.util.HashMap;
import java.util.Map;

/**
 * 此类操作当前状态，包括数据源key，用户自定义信息
 * 
 * @author akwei
 */
public class DALCurrentStatus {

    private static final String STATUS_DSKEY = "STATUS_DSKEY";

    private static final String STATUS_CUSTOM = "STATUS_CUSTOM";

    private static final ThreadLocal<Map<String, Object>> statusTL = new ThreadLocal<Map<String, Object>>();

    public DALCurrentStatus() {
    }

    public static void setDsKey(String dsKey) {
        setValue(STATUS_DSKEY, dsKey);
    }

    public static String getDsKey() {
        return (String) getValue(STATUS_DSKEY);
    }

    public static void setCustomInfo(DALCustomInfo dalCustomInfo) {
        setValue(STATUS_CUSTOM, dalCustomInfo);
    }

    public static DALCustomInfo getCustomInfo() {
        return (DALCustomInfo) getValue(STATUS_CUSTOM);
    }

    private static Map<String, Object> getMap() {
        Map<String, Object> map = statusTL.get();
        if (map == null) {
            map = new HashMap<String, Object>(2);
            statusTL.set(map);
        }
        return map;
    }

    private static Object getValue(String key) {
        Map<String, Object> map = getMap();
        return map.get(key);
    }

    private static void setValue(String key, Object value) {
        Map<String, Object> map = getMap();
        map.put(key, value);
    }

    public static void remove() {
        statusTL.remove();
    }
}
