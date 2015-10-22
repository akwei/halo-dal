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

		SQLExpression[] sqlExpressions = sqlInfo
		        .getSQLExpressions("pid");
		if(sqlExpressions==null) return null;
		for (SQLExpression e : sqlExpressions) {
			if (e.getSqlExpressionSymbol() == SQLExpressionSymbol.EQUAL) {
				long l = (Long) e.getValue();
				long dsNumber=(l%4)>1?1:0;
				long tableNumber=l%4;
				PartitionTableInfo partitionTableInfo = new PartitionTableInfo();
				partitionTableInfo.setRealTable("person"+tableNumber);
				partitionTableInfo.setDsName("ds0"+dsNumber);
				return partitionTableInfo;
			}
		}
		return null;
	}
}
