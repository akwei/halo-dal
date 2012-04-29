package halo.dal.partition.analysis;

public class SQLAnalyzerException extends RuntimeException {

    private static final long serialVersionUID = 6103872398725547682L;

    public SQLAnalyzerException() {
        super();
    }

    public SQLAnalyzerException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public SQLAnalyzerException(String arg0) {
        super(arg0);
    }

    public SQLAnalyzerException(Throwable arg0) {
        super(arg0);
    }
}
