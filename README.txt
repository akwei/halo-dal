halo-dal使用说明
使用场景:数据库分布式访问。
使用语言:java
使用条件:支持PreparedStatement处理的任何jdbc框架
jdk版本:jdk1.5以及以上版本

支持功能:
1, jdbc PreparedStatement。
2, 数据库分库分表访问，支持insert delete update select
3, 单数据库事务
4, 多数据库分步提交事务

不支持功能:
1, jdbc Statement访问. (使用 Statement访问时，不会进行sql的分表分库的解析，最终执行的sql是没有解析的)
2, 嵌套sql使用. (使用嵌套sql时，不会进行sql的分表分库的解析，最终执行的sql是没有解析的)
3, sql中不支持between ... and ..., 可是使用 >= and <=替代 (使用 between ... and ...时，会抛出异常)

