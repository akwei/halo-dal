package halo.dal.rw;

/**
 * 读写状态设定
 * 
 * @author akwei
 */
public class RWDataSourceStatus {

    private static final ThreadLocal<RWStatus> rwStatusTl = new ThreadLocal<RWStatus>();

    public static void setRWStatus(boolean read, String dsKey) {
        RWStatus rwStatus = getRWStatus();
        if (rwStatus == null) {
            rwStatus = new RWStatus();
        }
        rwStatus.setRead(read);
        rwStatus.setDsKey(dsKey);
        rwStatusTl.set(rwStatus);
    }

    public static void clearRWStatus() {
        rwStatusTl.remove();
    }

    public static RWStatus getRWStatus() {
        return rwStatusTl.get();
    }
}