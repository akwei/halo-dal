package parser;

import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;
import halo.dal.partition.DALPartitionParser;
import halo.dal.partition.DALPartitionTableInfo;

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
