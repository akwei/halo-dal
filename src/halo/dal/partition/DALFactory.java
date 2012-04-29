package halo.dal.partition;

import halo.dal.partition.analysis.DefSQLAnalyzer;
import halo.dal.partition.analysis.SQLAnalyzer;

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

    private DALPartitionParserFactory dalPartitionParserFactory;

    public DALFactory() {
        ins = this;
        this.setSqlAnalyzer(new DefSQLAnalyzer());
        this.setDalPartitionParserFactory(new DALDefPartitionParserFactory());
    }

    public DALFactory(SQLAnalyzer sqlAnalyzer,
            DALPartitionParserFactory dalDefPartitionParserFactory) {
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
            DALPartitionParserFactory dalPartitionParserFactory) {
        this.dalPartitionParserFactory = dalPartitionParserFactory;
    }

    public DALPartitionParserFactory getDalPartitionParserFactory() {
        return dalPartitionParserFactory;
    }
}