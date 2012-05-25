package example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update extends OpBase {

    public void update() throws Exception {
        // 根据sex进行分区，那么 sex字段必须在sql查询条件中 分区方式为奇偶分表分库
        this.update(0);// 从daltest0.user0表中更新数据
        this.update(2);// 从daltest0.user0表中更新数据
        this.update(1);// 从daltest1.user1表中更新数据
        this.update(3);// 从daltest1.user1表中更新数据
    }

    private void update(final int sex) throws Exception {
        String sql = "update user set nick=? where sex=?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = this.dataSource.getConnection();
            ps = con.prepareStatement(sql, java.sql.Statement.NO_GENERATED_KEYS);
            ps.setString(1, "upakwei");
            ps.setInt(2, sex);
            int res = ps.executeUpdate();
            System.out.println("update result count: " + res);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            if (ps != null) {
                ps.clearParameters();
                ps.close();
            }
            if (con != null)
                con.close();
        }
    }

    public static void main(String[] args) throws Exception {
        Update update = new Update();
        update.setUser("root");
        update.setPassword("asdasd");
        update.init();
        update.update();
    }
}
