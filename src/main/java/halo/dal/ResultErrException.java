package halo.dal;

public class ResultErrException extends DALRunTimeException {

    private static final long serialVersionUID = 2540567211524288975L;

    public ResultErrException() {
    }

    public ResultErrException(String message) {
        super(message);
    }

    public ResultErrException(Throwable cause) {
        super(cause);
    }

    public ResultErrException(String message, Throwable cause) {
        super(message, cause);
    }
}
