package halo.dal.magic;

import java.util.HashMap;
import java.util.Map;

public class DALDsInfo {

    private String dsKey;

    private final Map<String, String> tableMap = new HashMap<String, String>();

    public void setDsKey(String dsKey) {
        this.dsKey = dsKey;
    }

    public String getDsKey() {
        return dsKey;
    }

    public void setRealTable(String logicTableName, String realTableName) {
        tableMap.put(logicTableName, realTableName);
    }

    public String getRealTableName(String logicTableName) {
        return tableMap.get(logicTableName);
    }
}