package halo.dal.sql;

import halo.dal.DALCurrentStatus;
import halo.dal.DALRunTimeException;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 支持分布式数据源访问的Connection，此类暂时不支持非PreparedStatement方式分布式读写。
 * 
 * @author akwei
 */
public class DALConnection implements Connection {

	/**
	 * 保存了真正的Connection
	 */
	private final Map<String, Connection> conMap = new LinkedHashMap<String, Connection>();

	private boolean autoCommit = true;

	private int transactionIsolation = 0;

	private int holdability = 0;

	private boolean readOnly = false;

	private String catalog = null;

	private Map<String, Class<?>> typeMap = null;

	/**
	 * 自定义的数据源
	 */
	private DALDataSource dalDataSource;

	public DALConnection(DALDataSource dalDataSource) throws SQLException {
		this.dalDataSource = dalDataSource;
		this.setAutoCommit(true);
	}

	public void clearWarnings() throws SQLException {
		this.getCurrentConnection().clearWarnings();
	}

	public void close() throws SQLException {
		Collection<Connection> c = this.conMap.values();
		for (Connection con : c) {
			con.close();
		}
		DALCurrentStatus.remove();
	}

	public void commit() throws SQLException {
		Collection<Connection> c = this.conMap.values();
		for (Connection con : c) {
			con.commit();
		}
	}

	public Statement createStatement() throws SQLException {
		return this.getCurrentConnection().createStatement();
	}

	/**
	 * 获得当前需要使用的Connection
	 * 
	 * @return
	 */
	public Connection getCurrentConnection() {
		String name = DALCurrentStatus.getDsKey();
		Connection con = this.conMap.get(name);
		if (con == null) {
			try {
				con = this.dalDataSource.getCurrentConnection();
				this.initCurrentConnection(con);
				this.conMap.put(name, con);
			}
			catch (SQLException e) {
				throw new DALRunTimeException(e);
			}
		}
		return con;
	}

	/**
	 * 获得正在使用的Connection
	 * 
	 * @return
	 */
	private Connection getConnectionInUsing() {
		String name = DALCurrentStatus.getDsKey();
		return this.conMap.get(name);
	}

	private void initCurrentConnection(Connection con) throws SQLException {
		if (this.transactionIsolation != 0) {
			con.setTransactionIsolation(this.transactionIsolation);
		}
		if (this.getHoldability() != 0) {
			con.setHoldability(this.holdability);
		}
		if (!this.autoCommit) {
			con.setAutoCommit(this.autoCommit);
		}
		con.setReadOnly(this.readOnly);
		if (this.catalog != null) {
			con.setCatalog(this.catalog);
		}
		if (typeMap != null) {
			con.setTypeMap(typeMap);
		}
	}

	public Statement createStatement(int resultSetType, int resultSetConcurrency)
	        throws SQLException {
		return this.getCurrentConnection().createStatement(resultSetType,
		        resultSetConcurrency);
	}

	public Statement createStatement(int resultSetType,
	        int resultSetConcurrency, int resultSetHoldability)
	        throws SQLException {
		return this.getCurrentConnection().createStatement(resultSetType,
		        resultSetConcurrency, resultSetHoldability);
	}

	public boolean getAutoCommit() throws SQLException {
		return this.autoCommit;
	}

	public int getHoldability() throws SQLException {
		return this.holdability;
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		return this.getCurrentConnection().getMetaData();
	}

	public int getTransactionIsolation() throws SQLException {
		return this.transactionIsolation;
	}

	public Map<String, Class<?>> getTypeMap() throws SQLException {
		return this.getCurrentConnection().getTypeMap();
	}

	public SQLWarning getWarnings() throws SQLException {
		return this.getCurrentConnection().getWarnings();
	}

	public boolean isClosed() throws SQLException {
		Connection con = this.getConnectionInUsing();
		if (con == null) {
			return true;
		}
		return con.isClosed();
	}

	public boolean isReadOnly() throws SQLException {
		return this.readOnly;
	}

	public String nativeSQL(String sql) throws SQLException {
		return this.getCurrentConnection().nativeSQL(sql);
	}

	public CallableStatement prepareCall(String sql) throws SQLException {
		return this.getCurrentConnection().prepareCall(sql);
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
	        int resultSetConcurrency) throws SQLException {
		return this.getCurrentConnection().prepareCall(sql, resultSetType,
		        resultSetConcurrency);
	}

	public CallableStatement prepareCall(String sql, int resultSetType,
	        int resultSetConcurrency, int resultSetHoldability)
	        throws SQLException {
		return this.getCurrentConnection().prepareCall(sql, resultSetType,
		        resultSetConcurrency, resultSetHoldability);
	}

	public PreparedStatement prepareStatement(String sql) throws SQLException {
		DALPreparedStatement ps = this.createDALDalPreparedStatement(sql);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S);
		return ps;
	}

	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
	        throws SQLException {
		DALPreparedStatement ps = (DALPreparedStatement) this
		        .prepareStatement(sql);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S_I);
		ps.setAutoGeneratedKeys(autoGeneratedKeys);
		return ps;
	}

	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
	        throws SQLException {
		DALPreparedStatement ps = (DALPreparedStatement) this.prepareStatement(
		        sql, Statement.RETURN_GENERATED_KEYS);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S_$I);
		ps.setColumnIndexes(columnIndexes);
		return ps;
	}

	public PreparedStatement prepareStatement(String sql, String[] columnNames)
	        throws SQLException {
		DALPreparedStatement ps = (DALPreparedStatement) this.prepareStatement(
		        sql, Statement.RETURN_GENERATED_KEYS);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S_$S);
		ps.setColumnNames(columnNames);
		return ps;
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
	        int resultSetConcurrency) throws SQLException {
		DALPreparedStatement ps = (DALPreparedStatement) this
		        .prepareStatement(sql);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S_I_I);
		ps.setResultSetType(resultSetType);
		ps.setResultSetConcurrency(resultSetConcurrency);
		return ps;
	}

	public PreparedStatement prepareStatement(String sql, int resultSetType,
	        int resultSetConcurrency, int resultSetHoldability)
	        throws SQLException {
		DALPreparedStatement ps = (DALPreparedStatement) this
		        .prepareStatement(sql);
		ps.setCreateMethodByCon(DALPreparedStatement.CREATE_METHOD_BY_CON_S_I_I_I);
		ps.setResultSetType(resultSetType);
		ps.setResultSetConcurrency(resultSetConcurrency);
		ps.setResultSetHoldability(resultSetHoldability);
		return ps;
	}

	public void rollback() throws SQLException {
		Collection<Connection> c = conMap.values();
		for (Connection con : c) {
			con.rollback();
		}
	}

	public void setAutoCommit(boolean autoCommit) throws SQLException {
		this.autoCommit = autoCommit;
	}

	public void setCatalog(String catalog) throws SQLException {
		this.catalog = catalog;
	}

	public String getCatalog() throws SQLException {
		return this.getCurrentConnection().getCatalog();
	}

	public void setHoldability(int holdability) throws SQLException {
		this.holdability = holdability;
	}

	public void setReadOnly(boolean readOnly) throws SQLException {
		this.readOnly = readOnly;
	}

	public void setTransactionIsolation(int level) throws SQLException {
		this.transactionIsolation = level;
	}

	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		this.typeMap = map;
	}

	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		throw new SQLException("dal do not support savepoint");
	}

	public void rollback(Savepoint savepoint) throws SQLException {
		throw new SQLException("dal do not support savepoint");
	}

	public Savepoint setSavepoint() throws SQLException {
		throw new SQLException("dal do not support savepoint");
	}

	public Savepoint setSavepoint(String name) throws SQLException {
		throw new SQLException("dal do not support savepoint");
	}

	public Array createArrayOf(String typeName, Object[] elements)
	        throws SQLException {
		return this.getCurrentConnection().createArrayOf(typeName, elements);
	}

	public Blob createBlob() throws SQLException {
		return this.getCurrentConnection().createBlob();
	}

	public Clob createClob() throws SQLException {
		return this.getCurrentConnection().createClob();
	}

	public NClob createNClob() throws SQLException {
		return this.getCurrentConnection().createNClob();
	}

	public SQLXML createSQLXML() throws SQLException {
		return this.getCurrentConnection().createSQLXML();
	}

	public Struct createStruct(String typeName, Object[] attributes)
	        throws SQLException {
		return this.getCurrentConnection().createStruct(typeName, attributes);
	}

	public Properties getClientInfo() throws SQLException {
		return this.getCurrentConnection().getClientInfo();
	}

	public String getClientInfo(String name) throws SQLException {
		Connection con = this.getCurrentConnection();
		return con.getClientInfo(name);
	}

	public boolean isValid(int timeout) throws SQLException {
		return this.getCurrentConnection().isValid(timeout);
	}

	public void setClientInfo(Properties properties)
	        throws SQLClientInfoException {
		this.getCurrentConnection().setClientInfo(properties);
	}

	public void setClientInfo(String name, String value)
	        throws SQLClientInfoException {
		this.getCurrentConnection().setClientInfo(name, value);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.getCurrentConnection().isWrapperFor(iface);
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return this.getCurrentConnection().unwrap(iface);
	}

	private DALPreparedStatement createDALDalPreparedStatement(String sql) {
		DALPreparedStatement ps = new DALPreparedStatement();
		ps.setDalConnection(this);
		ps.setSql(sql);
		return ps;
	}
}