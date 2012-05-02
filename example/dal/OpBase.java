package dal;

import halo.dal.partition.DALDefPartitionParserFactory;
import halo.dal.partition.DALFactory;
import halo.dal.partition.DALPartitionParser;
import halo.dal.sql.DALDataSource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import parser.UserParser;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class OpBase {

    protected DALDataSource dataSource;

    protected DALFactory dalFactory;

    /**
     * 数据库用户名
     */
    protected String user;

    /**
     * 数据库密码
     */
    protected String password;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 此方法的初始化信息可以使用spring进行管理
     * 
     * @throws Exception
     */
    public void init() throws Exception {
        // 初始化数据库连接池,如果使用spring的话，可以使用spring初始化数据库连接池
        // map中的key为数据源key
        Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
        // datasource 0
        ComboPooledDataSource ds0 = new ComboPooledDataSource();
        ds0.setDriverClass("com.mysql.jdbc.Driver");
        ds0.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest0?useUnicode=true&characterEncoding=UTF-8");
        ds0.setUser(this.user);
        ds0.setPassword(this.password);
        ds0.setMaxPoolSize(20);
        ds0.setInitialPoolSize(10);
        ds0.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds0", ds0);
        // datasource 1
        ComboPooledDataSource ds1 = new ComboPooledDataSource();
        ds1.setDriverClass("com.mysql.jdbc.Driver");
        ds1.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest1?useUnicode=true&characterEncoding=UTF-8");
        ds1.setUser(this.user);
        ds1.setPassword(this.password);
        ds1.setMaxPoolSize(20);
        ds1.setInitialPoolSize(10);
        ds1.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds1", ds1);
        this.dataSource = new DALDataSource();
        this.dataSource.setDataSourceMap(dataSourceMap);
        // 初始化 DALFactory, 如果使用spring的话，可以使用spring初始化此类
        // dalFactory=new DALFactory();
        // 初始化解析器缓存
        Map<String, DALPartitionParser> parserMap = new HashMap<String, DALPartitionParser>();
        // 缓存user的分析器
        parserMap.put("user", new UserParser());
        // 初始化解析器工厂,可以使用spring进行管理
        DALDefPartitionParserFactory dalDefPartitionParserFactory = new DALDefPartitionParserFactory();
        dalDefPartitionParserFactory.setParserMap(parserMap);
        this.dalFactory = DALFactory.getInstance();
        this.dalFactory
                .setDalPartitionParserFactory(dalDefPartitionParserFactory);
    }
}
