package halo.dal.rw;

public class RWAnalyseException extends RuntimeException {

    private static final long serialVersionUID = 1994142467941083040L;

    public RWAnalyseException() {
        super();
    }

    public RWAnalyseException(String message, Throwable cause) {
        super(message, cause);
    }

    public RWAnalyseException(String message) {
        super(message);
    }

    public RWAnalyseException(Throwable cause) {
        super(cause);
    }
}
