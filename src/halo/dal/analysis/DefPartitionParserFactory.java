package halo.dal.analysis;

import java.util.Map;

/**
 * 默认解析器创建工厂
 * 
 * @author akwei
 */
public class DefPartitionParserFactory implements PartitionParserFactory {

	/**
	 * 缓存解析器
	 */
	private Map<String, PartitionParser> parserMap;

	public void setParserMap(Map<String, PartitionParser> parserMap) {
		this.parserMap = parserMap;
	}

	public Map<String, PartitionParser> getParserMap() {
		return parserMap;
	}

	public PartitionParser getParser(String key) {
		return parserMap.get(key);
	}
}