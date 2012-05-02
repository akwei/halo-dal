package halo.dal;

import halo.dal.analysis.DefSQLAnalyzer;
import halo.dal.analysis.SQLAnalyzer;
import halo.dal.partition.DefPartitionParserFactory;
import halo.dal.partition.PartitionParserFactory;

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

    private SQLAnalyzer sqlAnalyzer;

    private PartitionParserFactory dalPartitionParserFactory;

    public DALFactory() {
        ins = this;
        this.setSqlAnalyzer(new DefSQLAnalyzer());
        this.setDalPartitionParserFactory(new DefPartitionParserFactory());
    }

    public DALFactory(SQLAnalyzer sqlAnalyzer,
            PartitionParserFactory dalDefPartitionParserFactory) {
        super();
        ins = this;
        this.sqlAnalyzer = sqlAnalyzer;
        this.dalPartitionParserFactory = dalDefPartitionParserFactory;
    }

    public void setSqlAnalyzer(SQLAnalyzer sqlAnalyzer) {
        this.sqlAnalyzer = sqlAnalyzer;
    }

    public SQLAnalyzer getSqlAnalyzer() {
        return sqlAnalyzer;
    }

    public void setDalPartitionParserFactory(
            PartitionParserFactory dalPartitionParserFactory) {
        this.dalPartitionParserFactory = dalPartitionParserFactory;
    }

    public PartitionParserFactory getDalPartitionParserFactory() {
        return dalPartitionParserFactory;
    }
}