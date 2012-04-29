package halo.dal.partition;

/**
 * 解析器返回的解析结果
 * 
 * @author akwei
 */
public class DALPartitionTableInfo {

    /**
     * 真实的表名称
     */
    private String realTableName;

    /**
     * 数据源key.
     */
    private String dsName;

    public String getRealTableName() {
        return realTableName;
    }

    /**
     * set真实的表名称
     * 
     * @param realTableName
     *            真实的表名称
     */
    public void setRealTableName(String realTableName) {
        this.realTableName = realTableName;
    }

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
}