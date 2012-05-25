package example;

import halo.dal.sql.DALDataSource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class OpDataSource {

    public void op() throws Exception {
        Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
        // datasource 0
        ComboPooledDataSource ds0 = new ComboPooledDataSource();
        ds0.setDriverClass("com.mysql.jdbc.Driver");
        ds0.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest0?useUnicode=true&characterEncoding=UTF-8");
        ds0.setUser("user");
        ds0.setPassword("password");
        ds0.setMaxPoolSize(20);
        ds0.setInitialPoolSize(10);
        ds0.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds0", ds0);
        // datasource 1
        ComboPooledDataSource ds1 = new ComboPooledDataSource();
        ds1.setDriverClass("com.mysql.jdbc.Driver");
        ds1.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest1?useUnicode=true&characterEncoding=UTF-8");
        ds1.setUser("user");
        ds1.setPassword("password");
        ds1.setMaxPoolSize(20);
        ds1.setInitialPoolSize(10);
        ds1.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds1", ds1);
        DALDataSource dataSource = new DALDataSource();
        dataSource.setDataSourceMap(dataSourceMap);
    }
}
