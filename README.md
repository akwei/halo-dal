#halo-dal使用说明
使用场景:数据库分布式访问
使用语言:java
使用条件:支持PreparedStatement处理的任何jdbc框架
jdk版本:jdk1.5以及以上版本
项目依赖jar:commons-lang3-3.1.jar, commons-logging.jar,junit-4.10.jar(单元测试使用)

examplelib目录下的jar为例子中使用的jar

springexamplelib目录下的jar为spring例子中使用的jar

#支持功能:
1, jdbc PreparedStatement
2, 数据库分库分表访问，支持insert delete update select
3, 单数据库事务
4, 多数据库分步提交事务

#不支持功能:
1, jdbc Statement访问. (使用 Statement访问时，不会进行sql的分表分库的解析，最终执行的sql是没有解析的)
2, 嵌套sql使用. (使用嵌套sql时，不会进行sql的分表分库的解析，最终执行的sql是没有解析的)
3, sql中不支持between ... and ..., 可是使用 >= and <=替代 (使用 between ... and ...时，会抛出异常)

#如何使用

##不喜欢看以下说明，可以直接看example下的例子 
Insert.java Update.java Delete.java Select.java

###spring下面的例子为在spring中使用JdbcTemplate的方式，可以自定义扩展hibernate ibatis mybatis的配置

###example/sql中有测试数据库脚本,例子中使用的数据库为mysql


#如何编写数据库表的分析器:
####1, 编写代码实现 halo.dal.partition.DALPartitionParser 接口
####2, 实现 public DALPartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo)方法
####3，在解析器工厂中配置写好的解析器，或自定义解析器工厂并配置解析器
##举例

````java

package dal;

import halo.dal.partition.DALPartitionParser;
import halo.dal.partition.DALPartitionTableInfo;
import halo.dal.partition.analysis.SQLExpression;
import halo.dal.partition.analysis.SQLExpressionSymbol;
import halo.dal.partition.analysis.SQLInfo;

/**
 * 对user表进行分区，根据奇偶方式，将偶数sex放入daltest0.user0, 奇数sex放入daltest1.user1
 * 
 * @author akwei
 */
public class UserParser implements DALPartitionParser {

    public DALPartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo) {
        DALPartitionTableInfo info = new DALPartitionTableInfo();
        // 从sqlInfo获得条件表达式,由于定义的分区条件为sex字段，那么就需要获取sex字段的表达式
        // /由于获取的表达式会存在多个，例如进行范围判断的情况下，就会出现2个表达式，因此会返回一个数组
        SQLExpression[] sqlExpressions = sqlInfo.getSQLExpressions("sex");
        for (SQLExpression e : sqlExpressions) {
            // sex表达式我们只需要获得sex=?的等号表达式
            if (e.getSqlExpressionSymbol() == SQLExpressionSymbol.EQUAL) {
                Integer l = (Integer) e.getValue();
                // 获得表达式的值之后，进行奇偶判断，判断的结果就是我们获得的真实数据源key与表名称
                // 数据源key就是在创建DALDataSource的时候，写入map的key，这个key与真实的DataSource一一对应
                if (l.intValue() % 2 == 0) {
                    info.setRealTableName("user0");// 真实数据表名称
                    info.setDsName("ds0");// 真实数源key
                }
                else {
                    info.setRealTableName("user1");// 真实数据表名称
                    info.setDsName("ds1");// 真实数源key
                }
            }
        }
        return info;
    }
}

````
#如何创建或自定义解析器工厂
````java
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
````

#如何使用DALDataDource
##举例
###普通jdbc使用
````java
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
````
###在spring中使用
````xml
<bean id="dataSource" class="halo.dal.partition.sql.DALDataSource">
        <property name="dataSourceMap">
            <map>
                <entry key="ds0">
                    <bean class="com.mchange.v2.c3p0.ComboPooledDataSource">
                        <property name="driverClass" value="com.mysql.jdbc.Driver" />
                        <property name="jdbcUrl"
                            value="jdbc:mysql://127.0.0.1:3306/daltest0?useUnicode=true&amp;characterEncoding=UTF-8" />
                        <property name="user" value="root" />
                        <property name="password" value="asdasd" />
                        <property name="idleConnectionTestPeriod" value="60" />
                        <property name="maxPoolSize" value="20" />
                        <property name="initialPoolSize" value="10" />
                        <property name="minPoolSize" value="10" />
                    </bean>
                </entry>
                <entry key="ds1">
                    <bean class="com.mchange.v2.c3p0.ComboPooledDataSource">
                        <property name="driverClass" value="com.mysql.jdbc.Driver" />
                        <property name="jdbcUrl"
                            value="jdbc:mysql://127.0.0.1:3306/daltest1?useUnicode=true&amp;characterEncoding=UTF-8" />
                        <property name="user" value="root" />
                        <property name="password" value="asdasd" />
                        <property name="idleConnectionTestPeriod" value="60" />
                        <property name="maxPoolSize" value="20" />
                        <property name="initialPoolSize" value="10" />
                        <property name="minPoolSize" value="10" />
                    </bean>
                </entry>
            </map>
        </property>
    </bean>
````
