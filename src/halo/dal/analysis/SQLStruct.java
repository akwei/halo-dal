package halo.dal.analysis;


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

    private Map<String, String> alias_nameMap = new HashMap<String, String>(2);

    private Map<String, String> name_aliasMap = new HashMap<String, String>(2);

    private final List<String> tableNames = new ArrayList<String>(2);

    private List<ColumnExper> columnExpers = new ArrayList<ColumnExper>();

    public List<ColumnExper> getColumnExpers() {
        return columnExpers;
    }

    public void addColumnExper(ColumnExper columnExper) {
        columnExpers.add(columnExper);
    }

    /**
     * @param table
     *            包括表名与别名的sql片段,例如 user as u,user u
     */
    public void addTable(String table) {
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
        tableNames.add(name);
        if (alias != null) {
            alias_nameMap.put(alias, name);
            name_aliasMap.put(name, alias);
        }
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
}