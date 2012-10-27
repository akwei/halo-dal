package halo.dal;

/**
 * 此类操作当前状态，包括数据源key，用户自定义信息
 * 
 * @author akwei
 */
public class DALCurrentStatus {

	private static final String DSKEY_DEFAULT = "default_ds";

	private static final ThreadLocal<String> dsKeyTL = new ThreadLocal<String>();

	private static final ThreadLocal<DALCustomInfo> dalCustomInfoTL = new ThreadLocal<DALCustomInfo>();

	public DALCurrentStatus() {
	}

	public static void setDsKey(String dsKey) {
		dsKeyTL.set(dsKey);
	}

	/**
	 * 设置默认数据源
	 */
	public static void setDefaultDsKey() {
		setDsKey(DSKEY_DEFAULT);
	}

	public static String getDsKey() {
		return dsKeyTL.get();
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
