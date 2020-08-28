package code.task.lib.common.exception;

import code.task.lib.common.api.code.ErrorCode;

public class DuplicateDataException extends AbstractException {

    private static final long serialVersionUID = 1L;

    public DuplicateDataException(String code, String message) {
        super(code, message);
    }

    public DuplicateDataException(String code, String message, Throwable e) {
        super(code, message, e);
    }

    public DuplicateDataException(String message) {
        super(ErrorCode.COMM_E013, message);
    }
}
