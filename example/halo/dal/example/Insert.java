package halo.dal.example;

import halo.dal.partition.DALDefPartitionParserFactory;
import halo.dal.partition.DALFactory;
import halo.dal.partition.DALPartitionParser;
import halo.dal.partition.sql.DALDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import sun.tools.java.Type;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Insert {

    private DALDataSource dataSource;

    private DALFactory dalFactory;

    /**
     * 数据库用户名
     */
    private String user;

    /**
     * 数据库密码
     */
    private String password;

    /**
     * 此方法的初始化信息可以使用spring进行管理
     * 
     * @throws Exception
     */
    public void init() throws Exception {
        // 初始化数据库连接池,如果使用spring的话，可以使用spring初始化数据库连接池
        Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
        // datasource 0
        ComboPooledDataSource ds0 = new ComboPooledDataSource();
        ds0.setDriverClass("com.mysql.jdbc.Driver");
        ds0.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest0?useUnicode=true&characterEncoding=UTF-8");
        ds0.setUser(user);
        ds0.setPassword(password);
        ds0.setMaxPoolSize(20);
        ds0.setInitialPoolSize(10);
        ds0.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds0", ds0);
        // datasource 1
        ComboPooledDataSource ds1 = new ComboPooledDataSource();
        ds1.setDriverClass("com.mysql.jdbc.Driver");
        ds1.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/daltest1?useUnicode=true&characterEncoding=UTF-8");
        ds1.setUser(user);
        ds1.setPassword(password);
        ds1.setMaxPoolSize(20);
        ds1.setInitialPoolSize(10);
        ds1.setMinPoolSize(10);
        // 设置数据源key的对应关系
        dataSourceMap.put("ds1", ds1);
        dataSource = new DALDataSource();
        dataSource.setDataSourceMap(dataSourceMap);
        // 初始化 DALFactory, 如果使用spring的话，可以使用spring初始化此类
        // dalFactory=new DALFactory();
        dalFactory = DALFactory.getInstance();
        // 初始化解析器缓存
        Map<String, DALPartitionParser> parserMap = new HashMap<String, DALPartitionParser>();
        // 缓存user的分析器
        parserMap.put("user", new UserParser());
        // 初始化解析器工厂,可以使用spring进行管理
        DALDefPartitionParserFactory dalDefPartitionParserFactory = new DALDefPartitionParserFactory();
        dalDefPartitionParserFactory.setParserMap(parserMap);
        dalFactory.setDalPartitionParserFactory(dalDefPartitionParserFactory);
    }

    public void insert_into_daltest0_user0() throws Exception {
        final long time = System.currentTimeMillis() / 1000;
        String sql = "insert into user" + "(userid," + "nick," + "sex,"
                + "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
                + "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
                + "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
                + "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?" + ")";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = this.dataSource.getConnection();
            ps = con.prepareStatement(sql,
                    java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, 0);// <{userid: }>,
            ps.setString(2, "akwei");// <{nick: }>,
            ps.setNull(3, 0);// <{sex: }>,
            ps.setString(4, "addr");// <{addr: }>,
            ps.setString(5, "intro");// <{intro: }>,
            ps.setTimestamp(6, new Timestamp(time));// <{createtime: }>,
            ps.setLong(7, Long.MAX_VALUE);// <{uuid: }>,
            ps.setDouble(8, Type.NULL);// <{uuid2: }>,
            ps.setDouble(9, 90.8);// <{uuid3: }>,
            ps.setFloat(10, 89.7f);// <{uuid4: }>,
            ps.setFloat(11, Type.NULL);// <{uuid5: }>,
            ps.setInt(12, 10);// <{uuid6: }>,
            ps.setNull(13, Type.NULL);// <{uuid7: }>,
            ps.setInt(14, 80);// <{uuid8: }>,
            ps.setNull(15, Type.NULL);// <{uuid9: }>,
            ps.setNull(16, Type.NULL);// <{uuid10: }>,
            ps.setInt(17, Integer.MAX_VALUE);// <{uuid11: }>,
            ps.setNull(18, Type.NULL);// <{uuid12: }>
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            Number id = 0;// 数据库自动生成的id
            if (rs.next()) {
                id = (Number) rs.getObject(1);
            }
            System.out.println("insert into daltest0.user0  id : "
                    + id.longValue());
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            if (rs != null)
                rs.close();
            if (ps != null) {
                ps.clearParameters();
                ps.close();
            }
            if (con != null)
                con.close();
        }
    }

    public void insert_into_daltest1_user1() throws Exception {
        final long time = System.currentTimeMillis() / 1000;
        String sql = "insert into user" + "(userid," + "nick," + "sex,"
                + "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
                + "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
                + "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
                + "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?" + ")";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = this.dataSource.getConnection();
            ps = con.prepareStatement(sql,
                    java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, 0);// <{userid: }>,
            ps.setString(2, "akweiwei");// <{nick: }>,
            ps.setNull(3, 1);// <{sex: }>,
            ps.setString(4, "addr");// <{addr: }>,
            ps.setString(5, "intro");// <{intro: }>,
            ps.setTimestamp(6, new Timestamp(time));// <{createtime: }>,
            ps.setLong(7, Long.MAX_VALUE);// <{uuid: }>,
            ps.setDouble(8, Type.NULL);// <{uuid2: }>,
            ps.setDouble(9, 90.8);// <{uuid3: }>,
            ps.setFloat(10, 89.7f);// <{uuid4: }>,
            ps.setFloat(11, Type.NULL);// <{uuid5: }>,
            ps.setInt(12, 10);// <{uuid6: }>,
            ps.setNull(13, Type.NULL);// <{uuid7: }>,
            ps.setInt(14, 80);// <{uuid8: }>,
            ps.setNull(15, Type.NULL);// <{uuid9: }>,
            ps.setNull(16, Type.NULL);// <{uuid10: }>,
            ps.setInt(17, Integer.MAX_VALUE);// <{uuid11: }>,
            ps.setNull(18, Type.NULL);// <{uuid12: }>
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            Number id = 0;// 数据库自动生成的id
            if (rs.next()) {
                id = (Number) rs.getObject(1);
            }
            System.out.println("insert into daltest1.user1  id : "
                    + id.longValue());
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            if (rs != null)
                rs.close();
            if (ps != null) {
                ps.clearParameters();
                ps.close();
            }
            if (con != null)
                con.close();
        }
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) throws Exception {
        Insert insert = new Insert();
        insert.setUser("root");
        insert.setPassword("asdasd");
        insert.init();
        insert.insert_into_daltest0_user0();
        insert.insert_into_daltest1_user1();
    }
}
