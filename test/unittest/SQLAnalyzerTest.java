package unittest;

import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.DefSQLAnalyzer;
import junit.framework.Assert;

import org.junit.Test;

public class SQLAnalyzerTest {

    DefSQLAnalyzer sqlAnalyzer = new DefSQLAnalyzer();

    @Test
    public void delete() {
        String sql = "delete from user where uid=? and (age>=? or age<=?) and (sex=? or sex=?) and time<=sysdate()";
        Object[] values = new Object[] { 1, 50, 10, 1, 2 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals(
                "where uid=? and (age>=? or age<=?) and (sex=? or sex=?) and time<=sysdate()",
                sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
        // no where
        sql = "delete from user";
        sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, null);
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertNull(sqlInfo.getValues());
        sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void delete2() {
        String sql = "delete from user where uid=? and (age>=? or age<=?) and (sex=? or sex=?) and time<=sysdate()";
        Object[] values = new Object[] { 1, 50, 10, 1, 2 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("user", "user1");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user1", sqlInfo.getRealTableName("user"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals(
                "where uid=? and (age>=? or age<=?) and (sex=? or sex=?) and time<=sysdate()",
                sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(
                "delete from user1 where uid=? and (age>=? or age<=?) and (sex=? or sex=?) and time<=sysdate()",
                sql2);
        // no where
        sql = "delete from user";
        sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, null);
        sqlInfo.setRealTableName("user", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("user"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertNull(sqlInfo.getValues());
        sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void insert() {
        String sql = "insert into user(userid,nickname,sex) vlaues(?,?,?)";
        Object[] values = new Object[] { 4, "jack", 22 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(sqlInfo.getTableNames().length, 1);
        Assert.assertEquals(sqlInfo.getTableNames()[0], "user");
        Assert.assertEquals(sqlInfo.getOriginalSQL(), sql);
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertEquals(sqlInfo.getValues().length, values.length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
        Assert.assertEquals("userid",
                sqlInfo.getSQLExpressions("user.userid")[0].getColumn());
        Assert.assertEquals(4,
                sqlInfo.getSQLExpressions("user.userid")[0].getValue());
        Assert.assertEquals("nickname",
                sqlInfo.getSQLExpressions("user.nickname")[0].getColumn());
        Assert.assertEquals("jack",
                sqlInfo.getSQLExpressions("user.nickname")[0].getValue());
        Assert.assertEquals("sex",
                sqlInfo.getSQLExpressions("user.sex")[0].getColumn());
        Assert.assertEquals(22, sqlInfo.getSQLExpressions("sex")[0].getValue());
    }

    @Test
    public void insert2() {
        String sql = "insert into user(userid,nickname,sex) vlaues(?,?,?)";
        Object[] values = new Object[] { 4, "jack", 22 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("user", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("user"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(
                "insert into user2(userid,nickname,sex) vlaues(?,?,?)", sql2);
        Assert.assertEquals("userid",
                sqlInfo.getSQLExpressions("user.userid")[0].getColumn());
        Assert.assertEquals(4,
                sqlInfo.getSQLExpressions("user.userid")[0].getValue());
        Assert.assertEquals("nickname",
                sqlInfo.getSQLExpressions("user.nickname")[0].getColumn());
        Assert.assertEquals("jack",
                sqlInfo.getSQLExpressions("user.nickname")[0].getValue());
        Assert.assertEquals("sex",
                sqlInfo.getSQLExpressions("user.sex")[0].getColumn());
        Assert.assertEquals(22, sqlInfo.getSQLExpressions("sex")[0].getValue());
    }

    @Test
    public void update() {
        String sql = "update user set uid=? , o=? where name=?";
        Object[] values = new Object[] { 1, 3, "43" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(sqlInfo.getTableNames().length, 1);
        Assert.assertEquals(sqlInfo.getTableNames()[0], "user");
        Assert.assertEquals(sqlInfo.getOriginalSQL(), sql);
        Assert.assertEquals(sqlInfo.getWhereSQL(), "where name=?");
        Assert.assertEquals(sqlInfo.getValues().length, values.length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.uid")[0].getValue(), 1);
        Assert.assertEquals(sqlInfo.getSQLExpressions("user.o")[0].getValue(),
                3);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.name")[0].getValue(), "43");
    }

    @Test
    public void update2() {
        String sql = "update user set uid=? , o=? where name=?";
        Object[] values = new Object[] { 1, 3, "43" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("user", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("user"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals("where name=?", sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("update user2 set uid=? , o=? where name=?", sql2);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.uid")[0].getValue(), 1);
        Assert.assertEquals(sqlInfo.getSQLExpressions("user.o")[0].getValue(),
                3);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.name")[0].getValue(), "43");
    }

    @Test
    public void select() {
        String sql = "select * from user u,member as m "
                + "where u.uid=m.uid and u.sex=? or m.age>? " + "group by sex "
                + "order by sex " + "having name=?";
        Object[] values = new Object[] { 1, 5, "akwei" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("member", sqlInfo.getTableNames()[1]);
        Assert.assertEquals(1,
                sqlInfo.getSQLExpressions("user.sex")[0].getValue());
        Assert.assertEquals(5,
                sqlInfo.getSQLExpressions("member.age")[0].getValue());
        Assert.assertEquals(1, sqlInfo.getValues()[0]);
        Assert.assertEquals(5, sqlInfo.getValues()[1]);
        Assert.assertEquals("akwei", sqlInfo.getValues()[2]);
    }

    @Test
    public void select2() {
        String sql = "select * from user u,member as m "
                + "where u.uid=m.uid and u.sex=? or m.age>? " + "group by sex "
                + "order by sex " + "having name=?";
        Object[] values = new Object[] { 1, 5, "akwei" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("user", "user2");
        sqlInfo.setRealTableName("member", "member5");
        Assert.assertEquals("user", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("user"));
        Assert.assertEquals("member", sqlInfo.getTableNames()[1]);
        Assert.assertEquals("member5", sqlInfo.getRealTableName("member"));
        Assert.assertEquals(1,
                sqlInfo.getSQLExpressions("user.sex")[0].getValue());
        Assert.assertEquals(5,
                sqlInfo.getSQLExpressions("member.age")[0].getValue());
        Assert.assertEquals(1, sqlInfo.getValues()[0]);
        Assert.assertEquals(5, sqlInfo.getValues()[1]);
        Assert.assertEquals("akwei", sqlInfo.getValues()[2]);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("select * from user2 u,member5 as m "
                + "where u.uid=m.uid and u.sex=? or m.age>? " + "group by sex "
                + "order by sex " + "having name=?", sql2);
    }
}
