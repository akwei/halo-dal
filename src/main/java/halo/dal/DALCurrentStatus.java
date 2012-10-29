package halo.dal;

import halo.dal.sql.DALDataSource;

/**
 * 此类操作当前状态，包括数据源key，用户自定义信息
 * 
 * @author akwei
 */
public class DALCurrentStatus {

	private static final ThreadLocal<String> dsKeyTL = new ThreadLocal<String>();

	private static final ThreadLocal<DALCustomInfo> dalCustomInfoTL = new ThreadLocal<DALCustomInfo>();

	public DALCurrentStatus() {
	}

	public static void setDsKey(String dsKey) {
		dsKeyTL.set(dsKey);
	}

	public static String getDsKey() {
		String key = dsKeyTL.get();
		if (key == null) {
			key = DALDataSource.DSKEY_DEFAULT;
		}
		return key;
	}

	public static void setCustomInfo(DALCustomInfo dalCustomInfo) {
		dalCustomInfoTL.set(dalCustomInfo);
	}

	public static DALCustomInfo getCustomInfo() {
		return dalCustomInfoTL.get();
	}

	public static void remove() {
		dsKeyTL.remove();
		dalCustomInfoTL.remove();
	}
}
