package halo.dal.rw;

/**
 * 数据源指定以及读写状态指定
 * 
 * @author akwei
 */
public class RWStatus {

    private boolean read;

    private String dsKey;

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getDsKey() {
        return dsKey;
    }

    public void setDsKey(String dsKey) {
        this.dsKey = dsKey;
    }
}