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
        SQLExpression[] sqlExpressions = sqlInfo.getSQLExpressions("sex");
        for (SQLExpression e : sqlExpressions) {
            if (e.getSqlExpressionSymbol() == SQLExpressionSymbol.EQUAL) {
                Integer l = (Integer) e.getValue();
                if (l.intValue() % 2 == 0) {
                    info.setRealTableName("user0");//真实数据表名称
                    info.setDsName("ds0");//真实数源key
                }
                else {
                    info.setRealTableName("user1");//真实数据表名称
                    info.setDsName("ds1");//真实数源key
                }
            }
        }
        return info;
    }
}
