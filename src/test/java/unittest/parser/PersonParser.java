package unittest.parser;

import halo.dal.analysis.PartitionParser;
import halo.dal.analysis.PartitionTableInfo;
import halo.dal.analysis.SQLExpression;
import halo.dal.analysis.SQLExpressionSymbol;
import halo.dal.analysis.SQLInfo;
import halo.dal.sql.ConnectionStatus;

import org.springframework.stereotype.Component;

/**
 * 对user表进行分区，根据奇偶方式，将偶数userid放入daltest0.user0, 奇数放入daltest1.user1
 * 
 * @author akwei
 */
@Component("person")
public class PersonParser implements PartitionParser {

	public PartitionTableInfo parse(String tableLogicName, SQLInfo sqlInfo,
	        ConnectionStatus connectionStatus) {
		PartitionTableInfo partitionTableInfo = new PartitionTableInfo();
		SQLExpression[] sqlExpressions = sqlInfo
		        .getSQLExpressions("person.level");
		for (SQLExpression e : sqlExpressions) {
			if (e.getSqlExpressionSymbol() == SQLExpressionSymbol.EQUAL) {
				Integer l = (Integer) e.getValue();
				if (l.intValue() % 2 == 0) {
					partitionTableInfo.setRealTable("person0");
					partitionTableInfo.setDsName("ds00");
				}
				else {
					partitionTableInfo.setRealTable("person0");
					partitionTableInfo.setDsName("ds01");
				}
			}
		}
		return partitionTableInfo;
	}
}
