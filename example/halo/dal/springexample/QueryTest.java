package halo.dal.springexample;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/querytest.xml" })
@Transactional
public class QueryTest {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Test
	public void insert() {
		final long time = System.currentTimeMillis() / 1000;
		String sql = "insert into user" + "(userid," + "nick," + "sex,"
				+ "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
				+ "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
				+ "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
				+ "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?" + ")";
		// insert into daltest1,user1
		jdbcTemplate.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setLong(1, 0);// <{userid: }>,
				ps.setString(2, "akwei");// <{nick: }>,
				ps.setNull(3, 0);// <{sex: }>,
				ps.setString(4, "addr");// <{addr: }>,
				ps.setString(5, "intro");// <{intro: }>,
				ps.setTimestamp(6, new Timestamp(time));// <{createtime: }>,
				ps.setLong(7, Long.MAX_VALUE);// <{uuid: }>,
				ps.setDouble(8, Types.NULL);// <{uuid2: }>,
				ps.setDouble(9, 90.8);// <{uuid3: }>,
				ps.setFloat(10, 89.7f);// <{uuid4: }>,
				ps.setFloat(11, Types.NULL);// <{uuid5: }>,
				ps.setInt(12, 10);// <{uuid6: }>,
				ps.setNull(13, Types.NULL);// <{uuid7: }>,
				ps.setInt(14, 80);// <{uuid8: }>,
				ps.setNull(15, Types.NULL);// <{uuid9: }>,
				ps.setNull(16, Types.NULL);// <{uuid10: }>,
				ps.setInt(17, Integer.MAX_VALUE);// <{uuid11: }>,
				ps.setNull(18, Types.NULL);// <{uuid12: }>
			}
		});
		// insert into daltest0.user0
		jdbcTemplate.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setLong(1, 0);// <{userid: }>,
				ps.setString(2, "akwei");// <{nick: }>,
				ps.setNull(3, 1);// <{sex: }>,
				ps.setString(4, "addr");// <{addr: }>,
				ps.setString(5, "intro");// <{intro: }>,
				ps.setTimestamp(6, new Timestamp(time));// <{createtime: }>,
				ps.setLong(7, Long.MAX_VALUE);// <{uuid: }>,
				ps.setDouble(8, Types.NULL);// <{uuid2: }>,
				ps.setDouble(9, 90.8);// <{uuid3: }>,
				ps.setFloat(10, 89.7f);// <{uuid4: }>,
				ps.setFloat(11, Types.NULL);// <{uuid5: }>,
				ps.setInt(12, 10);// <{uuid6: }>,
				ps.setNull(13, Types.NULL);// <{uuid7: }>,
				ps.setInt(14, 80);// <{uuid8: }>,
				ps.setNull(15, Types.NULL);// <{uuid9: }>,
				ps.setNull(16, Types.NULL);// <{uuid10: }>,
				ps.setInt(17, Integer.MAX_VALUE);// <{uuid11: }>,
				ps.setNull(18, Types.NULL);// <{uuid12: }>
			}
		});
	}
}
