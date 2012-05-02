package halo.dal.rw;

public interface RWSQLInfoAnalyzer {

    /**
     * 解析sql，获得{@link RWSQLInfo}对象
     * 
     * @param sql
     *            sql语句
     * @param values
     *            参数
     * @return 参考 {@link RWSQLInfo}
     */
    RWSQLInfo analyse(String sql, Object[] values);
}