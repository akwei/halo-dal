package unittest.parser;

import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;
import halo.dal.partition.PartitionParser;
import halo.dal.partition.PartitionTableInfo;
import halo.dal.sql.ConnectionStatus;

/**
 * 对user表进行分区，根据奇偶方式，将偶数userid放入daltest0.user0, 奇数放入daltest1.user1
 * 
 * @author akwei
 */
public class UserParser implements PartitionParser {

    public PartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo,
            ConnectionStatus connectionStatus) {
        PartitionTableInfo info = new PartitionTableInfo();
        SQLExpression[] sqlExpressions = sqlInfo.getSQLExpressions("sex");
        for (SQLExpression e : sqlExpressions) {
            if (e.getSqlExpressionSymbol() == SQLExpressionSymbol.EQUAL) {
                Integer l = (Integer) e.getValue();
                if (l.intValue() % 2 == 0) {
                    info.setRealTableName("user0");
                    info.setDsName("ds0");
                }
                else {
                    info.setRealTableName("user1");
                    info.setDsName("ds1");
                }
            }
        }
        return info;
    }
}
