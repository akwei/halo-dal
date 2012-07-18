package unittest;

import java.util.List;

import org.junit.Test;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;

public class PerfTest {

    @Test
    public void test_perf() throws Exception {
        long sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum = sum + perfMySql("SELECT * FROM T");
        }
        System.out.println("total\t" + sum);
    }

    long perfMySql(String sql) {
        long startMillis = System.currentTimeMillis();
        for (int i = 0; i < 1000 * 100; ++i) {
            execMySql(sql);
        }
        long millis = System.currentTimeMillis() - startMillis;
        System.out.println("MySql\t" + millis);
        return millis;
    }

    private String execMySql(String sql) {
        StringBuilder out = new StringBuilder();
        MySqlOutputVisitor visitor = new MySqlOutputVisitor(out);
        MySqlStatementParser parser = new MySqlStatementParser(sql);
        List<SQLStatement> statementList = parser.parseStatementList();
        for (SQLStatement statement : statementList) {
            statement.accept(visitor);
            visitor.println();
        }
        return out.toString();
    }
}
