package halo.dal;

import halo.dal.analysis.DefSQLAnalyzer;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.partition.DefPartitionParserFactory;
import halo.dal.partition.PartitionParserFactory;
import halo.dal.rw.DefRWParserFactory;
import halo.dal.rw.RWParserFactory;

/**
 * DAL各种服务的赋值
 * 
 * @author akwei
 */
public class DALFactory {

    private static DALFactory ins = new DALFactory();

    public static DALFactory getInstance() {
        return ins;
    }

    /**
     * 是否需要读写分离方案
     */
    private boolean needRw;

    /**
     * 是否需要分区方案
     */
    private boolean needPartition;

    private SQLAnalyzer sqlAnalyzer;

    private PartitionParserFactory partitionParserFactory;

    private RWParserFactory rwParserFactory;

    /**
     * 默认构造方法，默认开启分区支持，默认关闭读写分离方案
     */
    public DALFactory() {
        ins = this;
        this.setSqlAnalyzer(new DefSQLAnalyzer());
        this.setPartitionParserFactory(new DefPartitionParserFactory());
        this.setRwParserFactory(new DefRWParserFactory());
        this.setNeedPartition(true);
        this.setNeedRw(false);
    }

    public DALFactory(SQLAnalyzer sqlAnalyzer,
            PartitionParserFactory dalDefPartitionParserFactory) {
        super();
        ins = this;
        this.sqlAnalyzer = sqlAnalyzer;
        this.partitionParserFactory = dalDefPartitionParserFactory;
    }

    public boolean isNeedRw() {
        return needRw;
    }

    public void setNeedRw(boolean needRw) {
        this.needRw = needRw;
    }

    public boolean isNeedPartition() {
        return needPartition;
    }

    public void setNeedPartition(boolean needPartition) {
        this.needPartition = needPartition;
    }

    public void setSqlAnalyzer(SQLAnalyzer sqlAnalyzer) {
        this.sqlAnalyzer = sqlAnalyzer;
    }

    public SQLAnalyzer getSqlAnalyzer() {
        return sqlAnalyzer;
    }

    public void setPartitionParserFactory(
            PartitionParserFactory partitionParserFactory) {
        this.partitionParserFactory = partitionParserFactory;
    }

    public PartitionParserFactory getPartitionParserFactory() {
        return partitionParserFactory;
    }

    public void setRwParserFactory(RWParserFactory rwParserFactory) {
        this.rwParserFactory = rwParserFactory;
    }

    public RWParserFactory getRwParserFactory() {
        return rwParserFactory;
    }
}