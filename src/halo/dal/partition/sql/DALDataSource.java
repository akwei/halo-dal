package halo.dal.partition.sql;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

/**
 * 支持分布式数据源访问的数据源。数据源中包含了需要访问的所有真实数据源.<br>
 * 目前不支持单数据源访问
 * 
 * @author akwei
 */
public class DALDataSource implements DataSource {

    private Map<String, DataSource> dataSourceMap;

    private PrintWriter logWriter;

    private int loginTimeout = 3;

    private boolean debugConnection;

    public void setDebugConnection(boolean debugConnection) {
        this.debugConnection = debugConnection;
    }

    public boolean isDebugConnection() {
        return debugConnection;
    }

    public DataSource getCurrentDataSource() {
        DataSource ds = this.dataSourceMap.get(DALDataSourceStatus
                .getCurrentDsKey());
        if (ds == null) {
            throw new RuntimeException("no datasource forKey [ "
                    + DALDataSourceStatus.getCurrentDsKey() + " ]");
        }
        return ds;
    }

    /**
     * 设定数据源key与真实数据源的对应关系.<br>
     * map中的key为数据源key,value为真实数据源
     * 
     * @param dataSourceMap
     */
    public void setDataSourceMap(Map<String, DataSource> dataSourceMap) {
        this.dataSourceMap = dataSourceMap;
    }

    public Connection getConnection() throws SQLException {
        return new DALConnection(this);
    }

    public Connection getConnection(String username, String password)
            throws SQLException {
        throw new SQLException("only support getConnection()");
    }

    public PrintWriter getLogWriter() throws SQLException {
        return this.logWriter;
    }

    public int getLoginTimeout() throws SQLException {
        return this.loginTimeout;
    }

    public void setLogWriter(PrintWriter out) throws SQLException {
        this.logWriter = out;
    }

    public void setLoginTimeout(int seconds) throws SQLException {
        this.loginTimeout = seconds;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return this.getCurrentDataSource().isWrapperFor(iface);
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return this.getCurrentDataSource().unwrap(iface);
    }
}