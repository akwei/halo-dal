package halo.dal.analysis;

import halo.dal.sql.ConnectionStatus;

/**
 * 数据分区分析器，通过此分析器可以分析表所在的具体的数据库与数据表名称。
 * 增加了读写分离需要的参数。此类不仅作为分表分库的分析器，还作为读写分离的分析器
 * 
 * @author akwei
 */
public interface PartitionParser {

    /**
     * 根据内容进行分析，创建表的分区信息
     * 
     * @param tableLogicName
     *            逻辑表名称，也将会成为表的别名
     * @param sqlInfo
     *            参考 {@link SQLInfo}
     * @param connectionStatus
     *            参考 {@link ConnectionStatus}
     * @param partitionTableInfo
     *            参考 {@link PartitionTableInfo}
     * @return
     */
    void parse(String tableLogicName, SQLInfo sqlInfo,
            ConnectionStatus connectionStatus,
            PartitionTableInfo partitionTableInfo);
}
