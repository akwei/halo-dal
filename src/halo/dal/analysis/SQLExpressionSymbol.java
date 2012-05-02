package halo.dal.analysis;

/**
 * sql表达式中的对应符号关系。目前支持 > , < , >= , <= , =
 * 
 * @author akwei
 */
public enum SQLExpressionSymbol {
    SMALLER(-2), SMALLER_EQUAL(-1), EQUAL(0), BIGGER(1), BIGGER_EQUAL(2);

    private int value;

    public int getValue() {
        return value;
    }

    private SQLExpressionSymbol(int value) {
        this.value = value;
    }
}
