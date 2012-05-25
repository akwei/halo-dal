package halo.dal.analysis;

import halo.dal.DALRunTimeException;

public class SQLAnalyzerException extends DALRunTimeException {

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
