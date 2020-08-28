package code.task.lib.common.exception;

import code.task.lib.common.api.code.ErrorCode;
import java.util.List;
import org.springframework.validation.FieldError;

public class InvalidQueryParameterException extends AbstractException {

    private static final long serialVersionUID = 1L;

    public InvalidQueryParameterException() { super(ErrorCode.COMM_E002, ErrorCode.COMM_E002.getMessage()); }

    public InvalidQueryParameterException(String code, String message) { super(code, message); }

    public InvalidQueryParameterException(String code, String message, Throwable e) {
        super(code, message, e);
    }

    public InvalidQueryParameterException(String message) { super(ErrorCode.COMM_E002, message); }

    public InvalidQueryParameterException(List<FieldError> fieldErrors) {
        super(fieldErrors);
    }
}
