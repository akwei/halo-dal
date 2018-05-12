package example;

import halo.dal.DALCurrentStatus;
import halo.dal.DALCustomInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/querytest.xml"})
//@Transactional
public class QueryTest {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void insert() {
        DALCustomInfo dalCustomInfo = new DALCustomInfo();
        dalCustomInfo.setDsKey("ds01");
        dalCustomInfo.setRealTable("person", "person2");
//        DALCurrentStatus.setCustomInfo(dalCustomInfo);
        final long time = System.currentTimeMillis() / 1000;
        final long userid;
        final String sql = "insert into person ( pid , name , level) values ( ? ,? ,?)";
        // insert into daltest1,user1
        userid = jdbcTemplate.execute(new PreparedStatementCreator() {

            public PreparedStatement createPreparedStatement(Connection con)
                    throws SQLException {
                PreparedStatement ps = con.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS);
                ps.setLong(1, 2);// <{pid: }>,
                ps.setString(2, "zxl");// <{name: }>,
                ps.setInt(3, 1);// <{level: }>,
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
        if(userid==0){
            Assert.fail("user id is 0 !");
        }
        // update daltest0.user0
//        DALCurrentStatus.setCustomInfo(dalCustomInfo);
        String sql2 = "update person set name = ? where pid = ?";
        int res = jdbcTemplate.update(sql2, new PreparedStatementSetter() {

            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, "zxlzxl");// <{name: }>,
                ps.setLong(2,2);
            }
        });
        if (res != 1) {
            Assert.fail("can not update user");
        }
    }
}
