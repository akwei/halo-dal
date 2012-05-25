package halo.dal.analysis;

/**
 * 解析器返回的解析结果
 * 
 * @author akwei
 */
public class PartitionTableInfo {

    /**
     * 真实表名称
     */
    private String realTable;

    /**
     * 数据源key.
     */
    private String dsName;

    public void setRealTable(String realTable) {
        this.realTable = realTable;
    }

    public String getRealTable() {
        return realTable;
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