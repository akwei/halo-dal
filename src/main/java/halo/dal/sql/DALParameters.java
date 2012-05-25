package halo.dal.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DALParameters {

    public final static int MN_SETNULL_I_I = 0;

    public final static int MN_SETBOOLEAN_I_BOOL = 1;

    public final static int MN_SETBYTE_I_BYTE = 2;

    public final static int MN_SETSHORT_I_SHORT = 3;

    public final static int MN_SETINT_I_I = 4;

    public final static int MN_SETLONG_I_L = 5;

    public final static int MN_SETFLOAT_I_F = 6;

    public final static int MN_SETDOUBLE_I_D = 7;

    public final static int MN_SETBIGDECIMAL_I_BIG = 8;

    public final static int MN_SETSTRING_I_S = 9;

    public final static int MN_SETBYTES_I_$BYTE = 10;

    public final static int MN_SETDATE_I_DATE = 11;

    public final static int MN_SETTIME_I_TIME = 12;

    public final static int MN_SETTIMESTAMP_I_TIMESTAMP = 13;

    public final static int MN_SETASCIISTREAM_I_IN_I = 14;

    public final static int MN_SETUNICODESTREAM_I_IN_I = 15;

    public final static int MN_SETBINARYSTREAM_I_IN_I = 16;

    public final static int MN_SETOBJECTI_O_I = 17;

    public final static int MN_SETOBJECT_I_O = 18;

    public final static int MN_SETCHARACTERSTREAM_I_READER_I = 19;

    public final static int MN_SETREF_I_REF = 20;

    public final static int MN_SETBLOB_I_BLOB = 21;

    public final static int MN_SETCLOB_I_CLOB = 22;

    public final static int MN_SETARRAY_I_ARRAY = 23;

    public final static int MN_SETDATE_I_DATE_CAL = 24;

    public final static int MN_SETTIME_I_TIME_CAL = 25;

    public final static int MN_SETTIMESTAMP_I_TIMESTAMP_CAL = 26;

    public final static int MN_SETNULL_I_I_S = 27;

    public final static int MN_SETURL_I_URL = 28;

    public final static int MN_SETROWID_I_ROWID = 29;

    public final static int MN_SETNSTRING_I_S = 30;

    public final static int MN_SETNCHARACTERSTREAM_I_READER_L = 31;

    public final static int MN_SETNCLOB_I_NCLOB = 32;

    public final static int MN_SETCLOB_I_READER_L = 33;

    public final static int MN_SETBLOB_I_IN_L = 34;

    public final static int MN_SETNCLOB_I_READER_L = 35;

    public final static int MN_SETSQLXML_I_SQLXML = 36;

    public final static int MN_SETOBJECT_I_O_I_I = 37;

    public final static int MN_SETASCIISTREAM_I_IN_L = 38;

    public final static int MN_SETBINARYSTREAM_I_IN_L = 39;

    public final static int MN_SETCHARACTERSTREAM_I_READER_L = 40;

    public final static int MN_SETASCIISTREAM_I_IN = 41;

    public final static int MN_SETBINARYSTREAM_I_IN = 42;

    public final static int MN_SETCHARACTERSTREAM_I_READER = 43;

    public final static int MN_SETNCHARACTERSTREAM_I_READER = 44;

    public final static int MN_SETCLOB_I_READER = 45;

    public final static int MN_SETBLOB_I_IN = 46;

    public final static int MN_SETNCLOB_I_READER = 47;

    public TreeMap<Integer, Object[]> methodArgMap = new TreeMap<Integer, Object[]>(
            new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return o1.intValue() - o2.intValue();
                }
            });

    /**
     * 字段值
     */
    public TreeMap<Integer, Object> valuesMap = new TreeMap<Integer, Object>(
            new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return o1.intValue() - o2.intValue();
                }
            });

    /**
     * 设置的参数(不一定与字段值相同)
     */
    public TreeMap<Integer, Object> parameterMap = new TreeMap<Integer, Object>(
            new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return o1.intValue() - o2.intValue();
                }
            });

    public Map<Integer, Integer> methodEncodeMap = new HashMap<Integer, Integer>();

    private List<Object> values = null;

    /**
     * 添加参数
     * 
     * @param methodEncode
     *            方法编码
     * @param parameterIndex
     *            参数索引
     * @param argInfo
     *            参数信息，包括参数，以及参数长度等其他参数信息
     */
    public void set(int methodEncode, int parameterIndex, Object[] argInfo) {
        parameterMap.put(parameterIndex, argInfo[0]);
        methodArgMap.put(parameterIndex, argInfo);
        methodEncodeMap.put(parameterIndex, methodEncode);
        if (methodEncode == MN_SETNULL_I_I || methodEncode == MN_SETNULL_I_I_S) {
            valuesMap.put(parameterIndex, null);
        }
        else {
            valuesMap.put(parameterIndex, argInfo[0]);
        }
    }

    public void clear() {
        methodArgMap.clear();
        methodEncodeMap.clear();
        values.clear();
    }

    public List<Object> getValues() {
        if (values == null) {
            values = new ArrayList<Object>(valuesMap.values());
        }
        return values;
    }

    public void initRealPreparedStatement(PreparedStatement ps)
            throws SQLException {
        Set<Entry<Integer, Object[]>> set = methodArgMap.entrySet();
        for (Entry<Integer, Object[]> e : set) {
            this.setParameter(e.getKey(), e.getValue(), ps);
        }
    }

    @SuppressWarnings("deprecation")
    private void setParameter(Integer i, Object[] objs, PreparedStatement ps)
            throws SQLException {
        int methodEncode = methodEncodeMap.get(i);
        switch (methodEncode) {
            case MN_SETNULL_I_I:
                ps.setNull(i, (Integer) objs[0]);
                break;
            case MN_SETBOOLEAN_I_BOOL:
                ps.setBoolean(i, (Boolean) objs[0]);
                break;
            case MN_SETBYTE_I_BYTE:
                ps.setByte(i, (Byte) objs[0]);
                break;
            case MN_SETSHORT_I_SHORT:
                ps.setShort(i, (Short) objs[0]);
                break;
            case MN_SETINT_I_I:
                ps.setInt(i, (Integer) objs[0]);
                break;
            case MN_SETLONG_I_L:
                ps.setLong(i, (Long) objs[0]);
                break;
            case MN_SETFLOAT_I_F:
                ps.setFloat(i, (Float) objs[0]);
                break;
            case MN_SETDOUBLE_I_D:
                ps.setDouble(i, (Double) objs[0]);
                break;
            case MN_SETBIGDECIMAL_I_BIG:
                ps.setBigDecimal(i, (BigDecimal) objs[0]);
                break;
            case MN_SETSTRING_I_S:
                ps.setString(i, (String) objs[0]);
                break;
            case MN_SETBYTES_I_$BYTE:
                ps.setBytes(i, (byte[]) objs[0]);
                break;
            case MN_SETDATE_I_DATE:
                ps.setDate(i, (Date) objs[0]);
                break;
            case MN_SETTIME_I_TIME:
                ps.setTime(i, (Time) objs[0]);
                break;
            case MN_SETTIMESTAMP_I_TIMESTAMP:
                ps.setTimestamp(i, (Timestamp) objs[0]);
                break;
            case MN_SETASCIISTREAM_I_IN_I:
                ps.setAsciiStream(i, (InputStream) objs[0]);
                break;
            case MN_SETUNICODESTREAM_I_IN_I:
                ps.setUnicodeStream(i, (InputStream) objs[0], (Integer) objs[1]);
                break;
            case MN_SETBINARYSTREAM_I_IN_I:
                ps.setBinaryStream(i, (InputStream) objs[0], (Integer) objs[1]);
                break;
            case MN_SETOBJECTI_O_I:
                ps.setObject(i, objs[0], (Integer) objs[1]);
                break;
            case MN_SETOBJECT_I_O:
                ps.setObject(i, objs[0]);
                break;
            case MN_SETCHARACTERSTREAM_I_READER_I:
                ps.setCharacterStream(i, (Reader) objs[0], (Integer) objs[1]);
                break;
            case MN_SETREF_I_REF:
                ps.setRef(i, (Ref) objs[0]);
                break;
            case MN_SETBLOB_I_BLOB:
                ps.setBlob(i, (Blob) objs[0]);
                break;
            case MN_SETCLOB_I_CLOB:
                ps.setClob(i, (Clob) objs[0]);
                break;
            case MN_SETARRAY_I_ARRAY:
                ps.setArray(i, (Array) objs[0]);
                break;
            case MN_SETDATE_I_DATE_CAL:
                ps.setDate(i, (Date) objs[0], (Calendar) objs[1]);
                break;
            case MN_SETTIME_I_TIME_CAL:
                ps.setTime(i, (Time) objs[0], (Calendar) objs[1]);
                break;
            case MN_SETTIMESTAMP_I_TIMESTAMP_CAL:
                ps.setTimestamp(i, (Timestamp) objs[0], (Calendar) objs[1]);
                break;
            case MN_SETNULL_I_I_S:
                ps.setNull(i, (Integer) objs[0], (String) objs[1]);
                break;
            case MN_SETURL_I_URL:
                ps.setURL(i, (URL) objs[0]);
                break;
            case MN_SETROWID_I_ROWID:
                ps.setRowId(i, (RowId) objs[0]);
                break;
            case MN_SETNSTRING_I_S:
                ps.setString(i, (String) objs[0]);
                break;
            case MN_SETNCHARACTERSTREAM_I_READER_L:
                ps.setCharacterStream(i, (Reader) objs[0], (Long) objs[1]);
                break;
            case MN_SETNCLOB_I_NCLOB:
                ps.setNClob(i, (NClob) objs[0]);
                break;
            case MN_SETCLOB_I_READER_L:
                ps.setClob(i, (Reader) objs[0], (Long) objs[1]);
                break;
            case MN_SETBLOB_I_IN_L:
                ps.setBlob(i, (InputStream) objs[0], (Long) objs[1]);
                break;
            case MN_SETNCLOB_I_READER_L:
                ps.setNClob(i, (Reader) objs[0], (Long) objs[1]);
                break;
            case MN_SETSQLXML_I_SQLXML:
                ps.setSQLXML(i, (SQLXML) objs[0]);
                break;
            case MN_SETOBJECT_I_O_I_I:
                ps.setObject(i, objs[0], (Integer) objs[1], (Integer) objs[2]);
                break;
            case MN_SETASCIISTREAM_I_IN_L:
                ps.setAsciiStream(i, (InputStream) objs[0], (Long) objs[1]);
                break;
            case MN_SETBINARYSTREAM_I_IN_L:
                ps.setBinaryStream(i, (InputStream) objs[0], (Long) objs[1]);
                break;
            case MN_SETCHARACTERSTREAM_I_READER_L:
                ps.setCharacterStream(i, (Reader) objs[0], (Long) objs[1]);
                break;
            case MN_SETASCIISTREAM_I_IN:
                ps.setAsciiStream(i, (InputStream) objs[0]);
                break;
            case MN_SETBINARYSTREAM_I_IN:
                ps.setBinaryStream(i, (InputStream) objs[0]);
                break;
            case MN_SETCHARACTERSTREAM_I_READER:
                ps.setCharacterStream(i, (Reader) objs[0]);
                break;
            case MN_SETNCHARACTERSTREAM_I_READER:
                ps.setNCharacterStream(i, (Reader) objs[0]);
                break;
            case MN_SETCLOB_I_READER:
                ps.setClob(i, (Reader) objs[0]);
                break;
            case MN_SETBLOB_I_IN:
                ps.setBlob(i, (InputStream) objs[0]);
                break;
            case MN_SETNCLOB_I_READER:
                ps.setNClob(i, (Reader) objs[0]);
                break;
        }
    }
}