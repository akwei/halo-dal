package halo.dal.partition;

import java.util.HashMap;
import java.util.Map;

/**
 * 需要把所有解析器存放到指定的同一个目录下。 通过此工厂创建解析器,解析器类名称规范为[logicTableName]Parser。首字母需大写
 * 
 * @author akwei
 */
public class DALPackagePartitionParserFactory implements DALPartitionParserFactory {

    private final Map<String, DALPartitionParser> parserMap = new HashMap<String, DALPartitionParser>();

    private String packageName;

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * key为logicTableName,获取指定的package下面的logicTableNameParser,类名首字母需大写.<br>
     * 例如<br>
     * logicTableName=user ,package=com.www,则解析器类名称为com.www.UserParser,key=user
     */
    public synchronized DALPartitionParser getParser(String key) {
        DALPartitionParser parser = parserMap.get(key);
        if (parser == null) {
            if (packageName == null) {
                throw new IllegalArgumentException("must set packageName");
            }
            String className = key.substring(0, 1).toUpperCase()
                    + key.substring(1) + "Parser";
            String fullClassName = packageName + "." + className;
            try {
                parser = (DALPartitionParser) DALPackagePartitionParserFactory.class
                        .getClassLoader().loadClass(fullClassName)
                        .getConstructor().newInstance();
                parserMap.put(key, parser);
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException("can not found " + fullClassName);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return parser;
    }
}