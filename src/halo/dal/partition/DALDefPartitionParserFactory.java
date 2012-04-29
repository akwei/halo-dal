package halo.dal.partition;

import java.util.Map;

/**
 * 默认解析器创建工厂
 * 
 * @author akwei
 */
public class DALDefPartitionParserFactory implements DALPartitionParserFactory {

    /**
     * 缓存解析器
     */
    private Map<String, DALPartitionParser> parserMap;

    public void setParserMap(Map<String, DALPartitionParser> parserMap) {
        this.parserMap = parserMap;
    }

    public Map<String, DALPartitionParser> getParserMap() {
        return parserMap;
    }

    public DALPartitionParser getParser(String key) {
        return parserMap.get(key);
    }
}