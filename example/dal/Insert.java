package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.sql.Types;

/**
 * 举例使用insert
 * 
 * @author akwei
 */
public class Insert extends OpBase {

	public void insert_into_daltest0_user0() throws Exception {
		final long time = System.currentTimeMillis() / 1000;
		String sql = "insert into user" + "(userid," + "nick," + "sex,"
				+ "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
				+ "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
				+ "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
				+ "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?" + ")";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = this.dataSource.getConnection();
			ps = con.prepareStatement(sql,
					java.sql.Statement.RETURN_GENERATED_KEYS);
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
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			Number id = 0;// 数据库自动生成的id
			if (rs.next()) {
				id = (Number) rs.getObject(1);
			}
			System.out.println("insert into daltest0.user0  id : "
					+ id.longValue());
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			if (rs != null)
				rs.close();
			if (ps != null) {
				ps.clearParameters();
				ps.close();
			}
			if (con != null)
				con.close();
		}
	}

	public void insert_into_daltest1_user1() throws Exception {
		final long time = System.currentTimeMillis() / 1000;
		String sql = "insert into user" + "(userid," + "nick," + "sex,"
				+ "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
				+ "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
				+ "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
				+ "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
				+ "?," + "?," + "?" + ")";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = this.dataSource.getConnection();
			ps = con.prepareStatement(sql,
					java.sql.Statement.RETURN_GENERATED_KEYS);
			ps.setLong(1, 0);// <{userid: }>,
			ps.setString(2, "akweiwei");// <{nick: }>,
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
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			Number id = 0;// 数据库自动生成的id
			if (rs.next()) {
				id = (Number) rs.getObject(1);
			}
			System.out.println("insert into daltest1.user1  id : "
					+ id.longValue());
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			if (rs != null)
				rs.close();
			if (ps != null) {
				ps.clearParameters();
				ps.close();
			}
			if (con != null)
				con.close();
		}
	}

	public static void main(String[] args) throws Exception {
		Insert insert = new Insert();
		insert.setUser("root");
		insert.setPassword("asdasd");
		insert.init();
		insert.insert_into_daltest0_user0();
		insert.insert_into_daltest1_user1();
	}
}
