package halo.dal.analysis;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 使用spring 依赖注入方式获得路由解析器，spring bean id必须是表的logicTableName
 * 
 * @author akwei
 */
public class SpringPartitionParserFactory implements PartitionParserFactory,
        ApplicationContextAware
{

	private ApplicationContext context;

	private final Map<String, PartitionParser> parserMap = new HashMap<String, PartitionParser>();

	/**
	 * key为logicTableName，需要为spring bean id
	 */
	public synchronized PartitionParser getParser(String key) {
		PartitionParser parser = parserMap.get(key);
		if (parser == null) {
			try {
				parser = (PartitionParser) this.context.getBean(key);
			}
			catch (BeansException e) {
				// 忽略此异常
				return null;
			}
		}
		if (parser != null) {
			parserMap.put(key, parser);
		}
		return parser;
	}

	public void setApplicationContext(ApplicationContext arg0)
	        throws BeansException {
		this.context = arg0;
	}
}
