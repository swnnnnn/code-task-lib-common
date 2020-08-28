package code.task.lib.common.exception;

import code.task.lib.common.api.code.ErrorCode;

public class DataNotFoundException extends AbstractException {

    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String code, String message) {
        super(code, message);
    }

    public DataNotFoundException(String code, String message, Throwable e) {
        super(code, message, e);
    }

    public DataNotFoundException(String message) {
        super(ErrorCode.COMM_E006, message);
    }
}
