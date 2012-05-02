package halo.dal.sql;

/**
 * 当前需要访问的数据源绑定类，此类与当前线程绑定。参考ThreadLocal方式使用
 * 
 * @author akwei
 */
public class DALDataSourceStatus {

    private static final ThreadLocal<String> currentDsKey = new ThreadLocal<String>();

    public static void setCurrentDsKey(String dsKey) {
        currentDsKey.set(dsKey);
    }

    public static void removeCurrentDsKey() {
        currentDsKey.remove();
    }

    public static String getCurrentDsKey() {
        return currentDsKey.get();
    }
}