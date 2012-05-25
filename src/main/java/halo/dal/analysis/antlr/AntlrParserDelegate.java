package halo.dal.analysis.antlr;

import java.util.List;

/**
 * 解析器委托类
 * 
 * @author akwei
 */
public interface AntlrParserDelegate {

    /**
     * 当获得表信息时，触发的方法
     * 
     * @param name
     *            表名称
     * @param alias
     */
    void onFindTable(String name, String alias);

    /**
     * 当获得insert update where 表达式时触发的方法
     * 
     * @param column
     *            表达式列名
     * @param op
     *            表达式符号例如 = >= ...
     */
    void onFindColExper(String column, String op);

    List<Table> getTables();

    List<ColExpr> getColExprs();
}