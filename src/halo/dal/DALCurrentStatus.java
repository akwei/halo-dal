package halo.dal;

import java.util.HashMap;
import java.util.Map;

public class DALCurrentStatus {

    private static final String STATUS_DSKEY = "STATUS_DSKEY";

    private static final ThreadLocal<Map<String, Object>> statusTL = new ThreadLocal<Map<String, Object>>();

    public DALCurrentStatus() {
    }

    public static void setCurrentDsKey(String dsKey) {
        setValue(STATUS_DSKEY, dsKey);
    }

    public static void remove() {
        statusTL.remove();
    }

    public static String getCurrentDsKey() {
        return (String) getValue(STATUS_DSKEY);
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
}
