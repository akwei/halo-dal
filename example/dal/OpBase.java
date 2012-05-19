package dal;

import halo.dal.DALFactory;
import halo.dal.analysis.DefPartitionParserFactory;
import halo.dal.analysis.PartitionParser;
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
        // datasource 00
        ComboPooledDataSource ds00 = new ComboPooledDataSource();
        ds00.setDriverClass("com.mysql.jdbc.Driver");
        ds00.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest00?useUnicode=true&characterEncoding=UTF-8");
        ds00.setUser(this.user);
        ds00.setPassword(this.password);
        ds00.setMaxPoolSize(20);
        ds00.setInitialPoolSize(10);
        ds00.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds00", ds00);
        // datasource 01
        ComboPooledDataSource ds01 = new ComboPooledDataSource();
        ds01.setDriverClass("com.mysql.jdbc.Driver");
        ds01.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest01?useUnicode=true&characterEncoding=UTF-8");
        ds01.setUser(this.user);
        ds01.setPassword(this.password);
        ds01.setMaxPoolSize(20);
        ds01.setInitialPoolSize(10);
        ds01.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds01", ds01);
        // datasource 10
        ComboPooledDataSource ds10 = new ComboPooledDataSource();
        ds10.setDriverClass("com.mysql.jdbc.Driver");
        ds10.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest10?useUnicode=true&characterEncoding=UTF-8");
        ds10.setUser(this.user);
        ds10.setPassword(this.password);
        ds10.setMaxPoolSize(20);
        ds10.setInitialPoolSize(10);
        ds10.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds10", ds10);
        // datasource 11
        ComboPooledDataSource ds11 = new ComboPooledDataSource();
        ds11.setDriverClass("com.mysql.jdbc.Driver");
        ds11.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest11?useUnicode=true&characterEncoding=UTF-8");
        ds11.setUser(this.user);
        ds11.setPassword(this.password);
        ds11.setMaxPoolSize(20);
        ds11.setInitialPoolSize(10);
        ds11.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds11", ds11);
        this.dataSource = new DALDataSource();
        this.dataSource.setDataSourceMap(dataSourceMap);
        // 初始化 DALFactory, 如果使用spring的话，可以使用spring初始化此类
        // dalFactory=new DALFactory();
        // 初始化解析器缓存
        Map<String, PartitionParser> parserMap = new HashMap<String, PartitionParser>();
        // 缓存user的分析器
        parserMap.put("user", new UserParser());
        // 初始化解析器工厂,可以使用spring进行管理
        DefPartitionParserFactory dalDefPartitionParserFactory = new DefPartitionParserFactory();
        dalDefPartitionParserFactory.setParserMap(parserMap);
        this.dalFactory = DALFactory.getDefault();
        this.dalFactory.setPartitionParserFactory(dalDefPartitionParserFactory);
    }
}
