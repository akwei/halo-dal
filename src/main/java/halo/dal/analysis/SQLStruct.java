package halo.dal.analysis;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 存储解析后的sql结构信息
 * 
 * @author akwei
 */
public class SQLStruct {

    /**
     * 是否可以解析,如果false，将不对结构进行分析
     */
    private boolean canParse;

    private Map<String, String> alias_nameMap = new HashMap<String, String>(2);

    private Map<String, String> name_aliasMap = new HashMap<String, String>(2);

    private final List<String> tableNames = new ArrayList<String>(2);

    private final List<ColumnExper> columnExpers = new ArrayList<ColumnExper>();

    public List<ColumnExper> getColumnExpers() {
        return columnExpers;
    }

    public void addColumnExper(ColumnExper columnExper) {
        if (!this.isCanParse()) {
            throw new SQLAnalyzerException("can not parse for canParse=false");
        }
        columnExpers.add(columnExper);
    }

    /**
     * @param table
     *            包括表名与别名的sql片段,例如 user as u,user u
     */
    public void addTable(String table) {
        if (!this.isCanParse()) {
            throw new SQLAnalyzerException("can not parse for canParse=false");
        }
        String[] name_aliases;
        if (table.indexOf(" as ") != -1) {
            name_aliases = table.split(" as ");
        }
        else {
            name_aliases = table.split(" ");
        }
        if (name_aliases.length == 2) {
            this.addTable(name_aliases[0].trim(), name_aliases[1].trim());
        }
        else {
            this.addTable(name_aliases[0].trim(), null);
        }
    }

    public void addTable(String name, String alias) {
        if (!this.isCanParse()) {
            throw new SQLAnalyzerException("can not parse for canParse=false");
        }
        tableNames.add(name);
        if (alias != null) {
            alias_nameMap.put(alias, name);
            name_aliasMap.put(name, alias);
        }
    }

    public boolean isCanParse() {
        return canParse;
    }

    public void setCanParse(boolean canParse) {
        this.canParse = canParse;
    }

    public String getAliasByTableName(String tableName) {
        return name_aliasMap.get(tableName);
    }

    public String getTableNameByAalias(String alias) {
        return alias_nameMap.get(alias);
    }

    public List<String> getTableNames() {
        return tableNames;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}