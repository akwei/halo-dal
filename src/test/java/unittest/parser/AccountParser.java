package unittest.parser;

import halo.dal.analysis.PartitionParser;
import halo.dal.analysis.PartitionTableInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;
import halo.dal.sql.ConnectionStatus;

public class AccountParser implements PartitionParser {

    public PartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo,
            ConnectionStatus connectionStatus) {
        SQLExpression[] es = sqlInfo.getSQLExpressions("uid");
        PartitionTableInfo partitionTableInfo = new PartitionTableInfo();
        for (SQLExpression e : es) {
            if (e.getSqlExpressionSymbol().equals(SQLExpressionSymbol.EQUAL)) {
                String value = (String) e.getValue();
                if (value.hashCode() % 2 == 0) {
                    partitionTableInfo.setRealTable("account");
                    partitionTableInfo.setDsName("ds00");
                }
                else {
                    partitionTableInfo.setRealTable("account");
                    partitionTableInfo.setDsName("ds01");
                }
            }
        }
        return partitionTableInfo;
    }
}
