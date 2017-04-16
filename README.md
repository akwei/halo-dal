# halo-dal使用说明
##### 使用场景:数据库分布式访问
##### 使用语言:java
##### 使用条件:支持PreparedStatement处理的任何jdbc框架,最好配合spring管理数据库连接池.
##### sql语句必须使用小写字符
##### jdk版本:jdk1.5以及以上版本
##### 请使用spring管理数据库连接池
##### 项目依赖jar:commons-lang3-3.1.jar, commons-logging.jar,junit-4.10.jar(单元测试使用)
##### examplelib目录下的jar为例子中使用的jar
##### springexamplelib目录下的jar为spring例子中使用的jar
##### 使用hibernate时，请设置 hibernate.temp.use_jdbc_metadata_defaults=false

# 支持功能:
##### 1, jdbc PreparedStatement
##### 2, 数据库分库分表访问，支持insert delete update select
##### 3, 单数据库事务
##### 4, 多数据库分步提交事务
##### 5, 读写分离
##### 6, 编程指定数据源和表
##### 7, 缓存sql结构

# 不支持功能:
##### 1, jdbc Statement访问. (使用 Statement访问时，不会进行sql的分表分库的解析，最终执行的sql是没有解析的)
##### 2, 不支持 (column_name)=? 对column_name加"()"
##### 5, sql中不支持 in(?,?,?)这种使用in 的预处理语句
##### 6, 分布式事务
##### 7, 不支持与同一张表进行join查询

## 不喜欢看以下说明，可以直接看example下的例子 
Insert.java Update.java Delete.java Select.java

### spring下面的例子为在spring中使用JdbcTemplate的方式，可以自定义扩展hibernate ibatis mybatis的配置

### example/sql中有测试数据库脚本,例子中使用的数据库为mysql

请先创建测试用的数据库，example/sql/dbinit.sql是数据库脚本

# 重要说明
在使用sequenece作为id时，请求sequenece的sql语句是没有任何库表信息的。因此会抛出dsKey 为null 的异常。因此在使用时，请先使用其他方式获得最新id。
不在分表分库的操作中首先使用sequence操作。



# 如何使用
## 1:数据库表的分析器
````java

package parser;

import halo.dal.analysis.PartitionParser;
import halo.dal.analysis.PartitionTableInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;
import halo.dal.sql.ConnectionStatus;

/**
 * 对user表进行分区，根据奇偶方式，将偶数sex放入daltest0.user0, 奇数sex放入daltest1.user1
 * 
 * @author akwei
 */
@Component("user")//可以使用spring注入,字符串为logicTableName
public class UserParser implements PartitionParser {

    public PartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo,
            ConnectionStatus connectionStatus) {
        PartitionTableInfo partitionTableInfo = new PartitionTableInfo();
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
                    partitionTableInfo.setRealTable("user0");// 真实数据表名称
                    partitionTableInfo.setDsName("ds00");// 真实数源key
                }
                else {
                    partitionTableInfo.setRealTable("user1");// 真实数据表名称
                    partitionTableInfo.setDsName("ds10");// 真实数源key
                }
            }
        }
        return partitionTableInfo;
    }
}


````
## 2:将解析器加入解析器工厂
````java
        // 初始化 DALFactory, 如果使用spring的话，可以使用spring初始化此类
        // DALFactory dalFactory=new DALFactory();
        // 初始化解析器缓存
        Map<String, DALPartitionParser> parserMap = new HashMap<String, DALPartitionParser>();
        // 缓存user的分析器
        parserMap.put("user", new UserParser());
        // 初始化解析器工厂,可以使用spring进行管理
        DefPartitionParserFactory dalDefPartitionParserFactory = new DefPartitionParserFactory();
        dalDefPartitionParserFactory.setParserMap(parserMap);
        dalFactory.setPartitionParserFactory(dalDefPartitionParserFactory);
````
## 3:配置数据库连接池
### jdbc 举例
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
        //dataSourceMap.put("default_ds", ds0); 当key=default_ds 时，为默认数据源，所有不分表分库的sql都会连接到此数据源执行
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
        //这就是我们使用的DataSource
        DALDataSource dataSource = new DALDataSource();
        dataSource.setDataSourceMap(dataSourceMap);
    }
````
### spring 举例
````xml
<bean id="dataSource" class="halo.dal.sql.DALDataSource">
        <property name="dataSourceMap">
            <map>
            <!-- 当key=default_ds 时，为默认数据源，所有不分表分库的sql都会连接到此数据源执行 -->
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
	<bean class="halo.dal.DALFactory">
		<!-- 解析器工厂可以自定义实现 -->
		<property name="partitionParserFactory">
			<!-- 为了尽量减少配置文件，可以使用如下的解析器工厂，此工厂可以根据logicTableName进行匹配解析器 -->
			<bean class="halo.dal.analysis.SpringPartitionParserFactory" />
		</property>
	</bean>
````
## 4:从DataSource中获得Connection进行使用
````java
Connection con = dalDataSource.getConnection();
PreparedStatement ps = con.prepareStatement(sql);
//其他处理过程
````

# 如何开启sql解析器缓存
## 编程开启
````java
DALFactory dalFactory = DALFactory.getDefault();
dalFactory.setSqlAnalyzer(new CachedSQLAnalyzer(new DefSQLAnalyzer()));
````

## spring 开启
````xml
<bean class="halo.dal.DALFactory">
    <property name="sqlAnalyzer">
        <bean class="halo.dal.analysis.def.CachedSQLAnalyzer">
            <constructor-arg index="0">
                <bean class="halo.dal.analysis.antlr.v3.AntlrV3SQLAnalyzer" /><!-- 或者使用自定义解析器 -->
            </constructor-arg>
        </bean>
    </property>
</bean>
````

# 如何自定义sql解析器SQLAnalyzer
## 1:编写解析器
````java
implements SQLAnalyzer
````
## 2:设置解析器
### 代码设置
````java
DALFactory dalFactory = DALFactory.getDefault();
dalFactory.setSqlAnalyzer(new CustomSQLAnalyzer());
````
### spring配置
````xml
<bean class="halo.dal.DALFactory">
    <property name="sqlAnalyzer">
        <bean class="CustomSQLAnalyzer"/>
    </property>
</bean>
````