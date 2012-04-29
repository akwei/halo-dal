package halo.dal.partition;

/**
 * 表分区分析器工厂接口,可自定义获取表分区分析器的方法
 * 
 * @author akwei
 */
public interface DALPartitionParserFactory {

    /**
     * 获取表分区分析器
     * 
     * @param key
     * @return 参考{@link DALPartitionParser}
     */
    DALPartitionParser getParser(String key);
}