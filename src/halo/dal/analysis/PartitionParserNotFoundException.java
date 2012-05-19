package halo.dal.analysis;

import halo.dal.DALRunTimeException;

public class PartitionParserNotFoundException extends DALRunTimeException {

    private static final long serialVersionUID = -6763710985545887876L;

    public PartitionParserNotFoundException() {
    }

    public PartitionParserNotFoundException(String message) {
        super(message);
    }

    public PartitionParserNotFoundException(Throwable cause) {
        super(cause);
    }

    public PartitionParserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
