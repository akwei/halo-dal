package halo.dal;

public class DALRunTimeException extends RuntimeException {

    private static final long serialVersionUID = 164568668865604175L;

    public DALRunTimeException() {
    }

    public DALRunTimeException(String message) {
        super(message);
    }

    public DALRunTimeException(Throwable cause) {
        super(cause);
    }

    public DALRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
