package halo.dal.sql;

import halo.dal.DALCurrentStatus;
import halo.dal.DALRunTimeException;

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

	public static final String DSKEY_DEFAULT = "default_ds";

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

	private DataSource getCurrentDataSource() {
		String name = DALCurrentStatus.getDsKey();
		DataSource ds = this.dataSourceMap.get(name);
		if (ds == null) {
			throw new DALRunTimeException("no datasource forKey [ " + name
			        + " ]");
		}
		return ds;
	}

	/**
	 * 真正的connection by zxl
	 * @return
	 * @throws SQLException
	 */
	public Connection getCurrentConnection() throws SQLException {
		return this.getCurrentDataSource().getConnection();
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

	/**
	 * 代理connection by zxl
	 * @return
	 * @throws SQLException
	 */
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