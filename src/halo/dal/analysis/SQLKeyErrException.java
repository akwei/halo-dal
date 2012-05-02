package halo.dal.analysis;

public class SQLKeyErrException extends RuntimeException {

    private static final long serialVersionUID = -6954894392781827723L;

    public SQLKeyErrException() {
    }

    public SQLKeyErrException(String message) {
        super(message);
    }

    public SQLKeyErrException(Throwable cause) {
        super(cause);
    }

    public SQLKeyErrException(String message, Throwable cause) {
        super(message, cause);
    }
}
