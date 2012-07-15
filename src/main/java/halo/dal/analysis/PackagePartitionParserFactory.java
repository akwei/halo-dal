package halo.dal.analysis;

import halo.dal.DALRunTimeException;

import java.util.HashMap;
import java.util.Map;

/**
 * 需要把所有解析器存放到指定的同一个目录下。 通过此工厂创建解析器,解析器类名称规范为[logicTableName]Parser。首字母需大写
 * 
 * @author akwei
 */
public class PackagePartitionParserFactory implements PartitionParserFactory {

    private final Map<String, PartitionParser> parserMap = new HashMap<String, PartitionParser>();

    private String packageName;

    /**
     * 设置解析器所在的目录，格式为pack.pack
     * 
     * @param packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * key为logicTableName,获取指定的package下面的logicTableNameParser,类名首字母需大写.<br>
     * 例如<br>
     * logicTableName=user ,package=com.www,则解析器类名称为com.www.UserParser,key=user
     */
    public synchronized PartitionParser getParser(String key) {
        PartitionParser parser = parserMap.get(key);
        if (parser == null) {
            if (packageName == null) {
                throw new IllegalArgumentException("must set packageName");
            }
            String className = key.substring(0, 1).toUpperCase()
                    + key.substring(1) + "Parser";
            String fullClassName = packageName + "." + className;
            try {
                parser = (PartitionParser) PackagePartitionParserFactory.class
                        .getClassLoader().loadClass(fullClassName)
                        .getConstructor().newInstance();
                parserMap.put(key, parser);
            }
            catch (ClassNotFoundException e) {
                // throw new DALRunTimeException("can not found " +
                // fullClassName);
                return null;
            }
            catch (Exception e) {
                throw new DALRunTimeException(e);
            }
        }
        return parser;
    }
}