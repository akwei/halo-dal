package halo.dal;

public class MultDataSourceOnOperateException extends DALRunTimeException {

    private static final long serialVersionUID = -2925586339854187007L;

    public MultDataSourceOnOperateException() {
        super();
    }

    public MultDataSourceOnOperateException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultDataSourceOnOperateException(String message) {
        super(message);
    }

    public MultDataSourceOnOperateException(Throwable cause) {
        super(cause);
    }
}
