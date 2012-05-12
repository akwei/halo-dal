package unittest;

import halo.dal.analysis.BasicSQLInfo;
import halo.dal.analysis.def.DefSQLAnalyzer;
import junit.framework.Assert;

import org.junit.Test;

public class SQLAnalyzerForUpperTest {

    DefSQLAnalyzer sqlAnalyzer = new DefSQLAnalyzer();

    @Test
    public void delete() {
        String sql = "DELETE FROM USER WHERE UID=? AND (AGE>=? OR AGE<=?) AND (SEX=? OR SEX=?) AND TIME<=SYSDATE()";
        Object[] values = new Object[] { 1, 50, 10, 1, 2 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals(
                "where UID=? and (AGE>=? or AGE<=?) and (SEX=? or SEX=?) and TIME<=SYSDATE()",
                sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
        // no where
        sql = "DELETE FROM USER";
        sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, null);
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertNull(sqlInfo.getValues());
        sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void delete2() {
        String sql = "DELETE FROM USER WHERE UID=? AND (AGE>=? OR AGE<=?) AND (SEX=? OR SEX=?) AND TIME<=SYSDATE()";
        Object[] values = new Object[] { 1, 50, 10, 1, 2 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("USER", "user1");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("user1", sqlInfo.getRealTableName("USER"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals(
                "where UID=? and (AGE>=? or AGE<=?) and (SEX=? or SEX=?) and TIME<=SYSDATE()",
                sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(
                "DELETE FROM user1 WHERE UID=? AND (AGE>=? OR AGE<=?) AND (SEX=? OR SEX=?) AND TIME<=SYSDATE()",
                sql2);
        // no where
        sql = "DELETE FROM USER";
        sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, null);
        sqlInfo.setRealTableName("USER", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("USER"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertNull(sqlInfo.getValues());
        sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("DELETE FROM user2", sql2);
    }

    @Test
    public void insert() {
        String sql = "INSERT INTO USER(USERID,NICKNAME,SEX) VLAUES(?,?,?)";
        Object[] values = new Object[] { 4, "jack", 22 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(sqlInfo.getTableNames().length, 1);
        Assert.assertEquals(sqlInfo.getTableNames()[0], "USER");
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
        Assert.assertEquals(22,
                sqlInfo.getSQLExpressions("sex")[0].getValue());
    }

    @Test
    public void insert2() {
        String sql = "INSERT INTO USER(USERID,NICKNAME,SEX) VLAUES(?,?,?)";
        Object[] values = new Object[] { 4, "jack", 22 };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("USER", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("USER"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertNull(sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(
                "INSERT INTO user2(USERID,NICKNAME,SEX) VLAUES(?,?,?)", sql2);
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
        Assert.assertEquals(22,
                sqlInfo.getSQLExpressions("user.sex")[0].getValue());
    }

    @Test
    public void update() {
        String sql = "UPDATE USER SET UID=? , O=? WHERE NAME=?";
        Object[] values = new Object[] { 1, 3, "43" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals(sqlInfo.getTableNames().length, 1);
        Assert.assertEquals(sqlInfo.getTableNames()[0], "USER");
        Assert.assertEquals(sqlInfo.getOriginalSQL(), sql);
        Assert.assertEquals(sqlInfo.getWhereSQL(), "where NAME=?");
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
        String sql = "UPDATE USER SET UID=? , O=? WHERE NAME=?";
        Object[] values = new Object[] { 1, 3, "43" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("USER", "user2");
        Assert.assertEquals(1, sqlInfo.getTableNames().length);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("USER"));
        Assert.assertEquals(sql, sqlInfo.getOriginalSQL());
        Assert.assertEquals("where NAME=?", sqlInfo.getWhereSQL());
        Assert.assertEquals(values.length, sqlInfo.getValues().length);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("UPDATE user2 SET UID=? , O=? WHERE NAME=?", sql2);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.uid")[0].getValue(), 1);
        Assert.assertEquals(sqlInfo.getSQLExpressions("user.o")[0].getValue(),
                3);
        Assert.assertEquals(
                sqlInfo.getSQLExpressions("user.name")[0].getValue(), "43");
    }

    @Test
    public void select() {
        String sql = "SELECT * FROM USER U,MEMBER AS M "
                + "WHERE U.UID=M.UID AND U.SEX=? OR M.AGE>? " + "GROUP BY SEX "
                + "ORDER BY SEX " + "HAVING NAME=?";
        Object[] values = new Object[] { 1, 5, "akwei" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("MEMBER", sqlInfo.getTableNames()[1]);
        Assert.assertEquals(1,
                sqlInfo.getSQLExpressions("user.sex")[0].getValue());
        Assert.assertEquals(5,
                sqlInfo.getSQLExpressions("member.age")[0].getValue());
        Assert.assertEquals(1, sqlInfo.getValues()[0]);
        Assert.assertEquals(5, sqlInfo.getValues()[1]);
        Assert.assertEquals("akwei", sqlInfo.getValues()[2]);
    }

    @Test
    public void selectForIn() {
        String sql = "SELECT * FROM USER U,MEMBER AS M "
                + "WHERE U.UID=M.UID AND U.SEX=? OR M.AGE>? ID IN(1,2,3)"
                + "GROUP BY SEX " + "ORDER BY SEX " + "HAVING NAME=?";
        Object[] values = new Object[] { 1, 5, "akwei" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals(sql, sql2);
    }

    @Test
    public void selectNoWhere() {
        String sql = "SELECT * FROM USER";
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, null);
        sqlInfo.setRealTableName("USER", "user2");
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("SELECT * FROM user2", sql2);
    }

    @Test
    public void select2() {
        String sql = "SELECT * FROM USER U,MEMBER AS M "
                + "WHERE U.UID=M.UID AND U.SEX=? OR M.AGE>? " + "GROUP BY SEX "
                + "ORDER BY SEX " + "HAVING NAME=?";
        Object[] values = new Object[] { 1, 5, "akwei" };
        BasicSQLInfo sqlInfo = (BasicSQLInfo) sqlAnalyzer.analyse(sql, values);
        sqlInfo.setRealTableName("USER", "user2");
        sqlInfo.setRealTableName("MEMBER", "member5");
        Assert.assertEquals("USER", sqlInfo.getTableNames()[0]);
        Assert.assertEquals("user2", sqlInfo.getRealTableName("USER"));
        Assert.assertEquals("MEMBER", sqlInfo.getTableNames()[1]);
        Assert.assertEquals("member5", sqlInfo.getRealTableName("MEMBER"));
        Assert.assertEquals(1,
                sqlInfo.getSQLExpressions("user.sex")[0].getValue());
        Assert.assertEquals(5,
                sqlInfo.getSQLExpressions("member.age")[0].getValue());
        Assert.assertEquals(1, sqlInfo.getValues()[0]);
        Assert.assertEquals(5, sqlInfo.getValues()[1]);
        Assert.assertEquals("akwei", sqlInfo.getValues()[2]);
        String sql2 = sqlAnalyzer.outPutSQL(sqlInfo, null);
        Assert.assertEquals("SELECT * FROM user2 U,member5 AS M "
                + "WHERE U.UID=M.UID AND U.SEX=? OR M.AGE>? " + "GROUP BY SEX "
                + "ORDER BY SEX " + "HAVING NAME=?", sql2);
    }
}
