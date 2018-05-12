package unittest;

import halo.dal.DALCurrentStatus;
import halo.dal.DALCustomInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.List;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/querytest.xml"})
@Transactional
public class QueryTest {

    @Resource
    private JdbcTemplate jdbcTemplate;

    /**
     * 使用默认数据源
     */
    @Test
    public void insertDefault() {
        final String sql = "insert into robot(name,stat) values(?,?)";
        final int rid = jdbcTemplate.execute(new PreparedStatementCreator() {

            public PreparedStatement createPreparedStatement(Connection con)
                    throws SQLException {
                PreparedStatement ps = con.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, "akwei");
                ps.setInt(2, 1);
                return ps;
            }
        }, new PreparedStatementCallback<Integer>() {

            public Integer doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
                return 0;
            }
        });
        Assert.assertNotSame(0, rid);
        final String sql2 = "update robot set name='weiwei',stat=5 where rid="
                + rid;
        int res = jdbcTemplate.update(sql2);
        Assert.assertEquals(1, res);
        List<Robot> list = jdbcTemplate.query(
                "select rid,name,stat from robot where rid=?",
                new Object[] { rid }, new RowMapper<Robot>() {

                    public Robot mapRow(ResultSet rs, int arg1)
                            throws SQLException {
                        Robot o = new Robot();
                        o.setRid(rs.getInt("rid"));
                        o.setName(rs.getString("name"));
                        o.setStat(rs.getInt("stat"));
                        return o;
                    }
                });
        Robot robot = list.get(0);
        Assert.assertNotNull(robot);
        Assert.assertEquals(rid, robot.getRid());
        Assert.assertEquals("weiwei", robot.getName());
        Assert.assertEquals(5, robot.getStat());
    }

    @Test
    public void insert() {
        DALCustomInfo dalCustomInfo = new DALCustomInfo();
        dalCustomInfo.setDsKey("ds01");
        dalCustomInfo.setRealTable("user", "user0");
        DALCurrentStatus.setCustomInfo(dalCustomInfo);
        final long time = System.currentTimeMillis() / 1000;
        final long userid;
        final String sql = "insert into user" + "(userid," + "nick," + "sex,"
                + "addr," + "intro," + "createtime," + "uuid," + "uuid2,"
                + "uuid3," + "uuid4," + "uuid5," + "uuid6," + "uuid7,"
                + "uuid8," + "uuid9," + "uuid10," + "uuid11," + "uuid12)"
                + "values" + "(" + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?," + "?,"
                + "?," + "?," + "?" + ")";
        // insert into daltest1,user1
        userid = jdbcTemplate.execute(new PreparedStatementCreator() {

            public PreparedStatement createPreparedStatement(Connection con)
                    throws SQLException {
                PreparedStatement ps = con.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS);
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
                return ps;
            }
        }, new PreparedStatementCallback<Long>() {

            public Long doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getLong(1);
                }
                return 0L;
            }
        });
        // update daltest0.user0
        DALCurrentStatus.setCustomInfo(dalCustomInfo);
        String sql2 = "update user set " + "nick = ?," + "sex = ?,"
                + "addr = ?," + "intro = ?," + "createtime = ?," + "uuid = ?,"
                + "uuid2 = ?," + "uuid3 = ?," + "uuid4 = ?," + "uuid5 = ?,"
                + "uuid6 = ?," + "uuid7 = ?," + "uuid8 = ?," + "uuid9 = ?,"
                + "uuid10 = ?," + "uuid11 = ?," + "uuid12 = ?"
                + " WHERE userid=?";
        int res = jdbcTemplate.update(sql2, new PreparedStatementSetter() {

            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, "akwei");// <{nick: }>,
                ps.setNull(2, 1);// <{sex: }>,
                ps.setString(3, "addr");// <{addr: }>,
                ps.setString(4, "intro");// <{intro: }>,
                ps.setTimestamp(5, new Timestamp(time));// <{createtime: }>,
                ps.setLong(6, Long.MAX_VALUE);// <{uuid: }>,
                ps.setDouble(7, Types.NULL);// <{uuid2: }>,
                ps.setDouble(8, 90.8);// <{uuid3: }>,
                ps.setFloat(9, 89.7f);// <{uuid4: }>,
                ps.setFloat(10, Types.NULL);// <{uuid5: }>,
                ps.setInt(11, 10);// <{uuid6: }>,
                ps.setNull(12, Types.NULL);// <{uuid7: }>,
                ps.setInt(13, 80);// <{uuid8: }>,
                ps.setNull(14, Types.NULL);// <{uuid9: }>,
                ps.setNull(15, Types.NULL);// <{uuid10: }>,
                ps.setInt(16, Integer.MAX_VALUE);// <{uuid11: }>,
                ps.setNull(17, Types.NULL);// <{uuid12: }>
                ps.setLong(18, userid);
            }
        });
        if (res != 1) {
            Assert.fail("can not update user");
        }
    }
}
