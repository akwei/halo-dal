package halo.dal.rw;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

/**
 * 读写分离的DataSource，目前考虑的条件为一主多从
 * 
 * @author akwei
 */
public class RWDataSource implements DataSource {

    private DataSource masterDataSource;

    private Map<String, DataSource> slaveDataSourceMap;

    public void setMasterDataSource(DataSource masterDataSource) {
        this.masterDataSource = masterDataSource;
    }

    public void setSlaveDataSourceMap(Map<String, DataSource> slaveDataSourceMap) {
        this.slaveDataSourceMap = slaveDataSourceMap;
    }

    public DataSource getMasterDataSource() {
        return masterDataSource;
    }

    public Map<String, DataSource> getSlaveDataSourceMap() {
        return slaveDataSourceMap;
    }

    public PrintWriter getLogWriter() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    public void setLogWriter(PrintWriter out) throws SQLException {
        // TODO Auto-generated method stub
    }

    public void setLoginTimeout(int seconds) throws SQLException {
        // TODO Auto-generated method stub
    }

    public int getLoginTimeout() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    public Connection getConnection() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    public Connection getConnection(String username, String password)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
}
