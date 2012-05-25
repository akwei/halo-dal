package example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select extends OpBase {

	public void select() throws Exception {
		// 根据sex进行分区，那么 sex字段必须在sql查询条件中 分区方式为奇偶分表分库
		this.select(0);// 从daltest0.user0表中获取数据
		this.select(2);// 从daltest0.user0表中获取数据
		this.select(1);// 从daltest1.user1表中获取数据
		this.select(3);// 从daltest1.user1表中获取数据
	}

	private void select(final int sex) throws Exception {
		String sql = "select * from user where sex=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = this.dataSource.getConnection();
			ps = con.prepareStatement(sql, java.sql.Statement.NO_GENERATED_KEYS);
			ps.setInt(1, sex);
			rs = ps.executeQuery();

			while (rs.next()) {
				long userid = rs.getLong("userid");
				String nick = rs.getString("nick");
				System.out.println("userid: " + userid + "   nick: " + nick);
			}

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
		Select select = new Select();
		select.setUser("root");
		select.setPassword("asdasd");
		select.init();
		select.select();
	}
}
