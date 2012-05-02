package halo.dal.analysis;

public class SQLExceptionErrException extends RuntimeException {

    private static final long serialVersionUID = -5440840544647899033L;

    public SQLExceptionErrException() {
        super();
    }

    public SQLExceptionErrException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public SQLExceptionErrException(String arg0) {
        super(arg0);
    }

    public SQLExceptionErrException(Throwable arg0) {
        super(arg0);
    }
}
