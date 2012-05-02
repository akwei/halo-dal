package halo.dal.rw;

import java.util.Map;

public class DefRWParserFactory implements RWParserFactory {

    /**
     * 缓存解析器
     */
    private Map<String, RWParser> parserMap;

    public void setParserMap(Map<String, RWParser> parserMap) {
        this.parserMap = parserMap;
    }

    public Map<String, RWParser> getParserMap() {
        return parserMap;
    }

    public RWParser getParser(String key) {
        return parserMap.get(key);
    }
}
