package example.pertest;

import halo.dal.analysis.antlr.AntlrParserDelegate;
import halo.dal.analysis.antlr.DefAntlrParserDelegate;
import halo.dal.analysis.antlr.v3.AntlrV3SQLLexer;
import halo.dal.analysis.antlr.v3.AntlrV3SQLParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class PerSQLAnalyzer {

//    @Test
    public void exeTest() {
        long sum = 0;
        String sql = "SELECT nodeId, nodeName, taskflowName, taskflowVersion"
                + "FROM"
                + "("
                + "SELECT n.ID AS nodeId, n.name AS nodeName , f.name AS taskflowName,"
                + "f.version AS taskflowVersion"
                + "FROM HT_TASK_FLOW_NODE_WA_2 n, HT_TASK_FLOW_WA_2 f"
                + "WHERE n.owner = ? AND "
                + "("
                + "n.STATUS IN (?) AND n.GMT_MODIFIED < ? AND n.IS_AUTO = 'Y' AND n.task_flow_id = f.id"
                + ")" + "ORDER BY f.priority DESC, f.gmt_create ASC" + ")"
                + "WHERE rownum < ?";
        for (int i = 0; i < 10; i++) {
            sum = sum + this.performance(sql);
        }
        System.out.println("total : " + sum);
    }

    long performance(String sql) {
        // String sql = "SELECT count(*), "
        // + "count(*) as kk,"
        // + "count(*) kk0,"
        // // +
        // "gatewayeve0_.ID as ID1_, gatewayeve0_.ADAPTER_ID as ADAPTER2_1_, "
        // // +
        // "gatewayeve0_.ADAPTER_MEMO as ADAPTER3_1_, gatewayeve0_.ADAPTER_NAME as ADAPTER4_1_, "
        // // +
        // "gatewayeve0_.CREATETIME as CREATETIME1_, gatewayeve0_.END_DATE as END6_1_, "
        // // +
        // "gatewayeve0_.EVENT_ID as EVENT7_1_, gatewayeve0_.EVENT_STATUS as EVENT8_1_, "
        // // +
        // "gatewayeve0_.EVENT_TYPE as EVENT9_1_, gatewayeve0_.LASTUPDTIME as LASTUPD10_1_, "
        // // +
        // "gatewayeve0_.MERCHANT_ID as MERCHANT11_1_, gatewayeve0_.MERCHANT_NAME as MERCHANT12_1_, "
        // // + "gatewayeve0_.NAME as NAME1_, gatewayeve0_.OPRID as OPRID1_, "
        // // + "GATEWAYEVE0_.ID AS ID1_,"
        // // + "GATEWAYEVE0_.NAME  NAME1_,"
        // + "GATEWAYEVE0_.START_DATE AS START15_1_"
        // + "FROM gateway_event1 GATEWAYEVE0_ , table2 as t2"
        // + "WHERE 1=? and 1=2 or 3.5=6.7 and b='s do' and time=sysdate() or "
        // + "name=substring(a.b,'c',b,b.c,'') and kk=substring('') and uid in "
        // +
        // "(select * from user where sex=? order by gid desc group by ss having a=b.c) "
        // + "AND GATEWAYEVE0_.EVENT_STATUS=?";
        //
        // String sql = "SELECT * FROM T";
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1000 * 1000; i++) {
            this.parse(sql);
        }
        long result = System.currentTimeMillis() - begin;
        System.out.println(result);
        return result;
    }

    private void parse(String sql) {
        AntlrV3SQLLexer lexer = new AntlrV3SQLLexer(new ANTLRStringStream(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrV3SQLParser parser = new AntlrV3SQLParser(tokens);
        AntlrParserDelegate delegate = new DefAntlrParserDelegate();
        parser.setAntlrParserDelegate(delegate);
        try {
            parser.start();
        }
        catch (RecognitionException e) {
            throw new RuntimeException(e);
        }
    }
}
