2012-09-30
1,增加对between and 的支持
2,修改不需要解析的bug
3,修改解析器delegate
4,增加对db2分页获取数据的支持
2012-07-18
1,支持sql中使用column_name='a' column_name=sysdate() 的赋值方式，但是此column_name的值不能作为分区关键字使用
2,添加当使用 PartitionParser 进行解析时，返回null的提示
3,更新Antlr解析 支持between and 操作
2012-07-15
1,支持设置默认数据源