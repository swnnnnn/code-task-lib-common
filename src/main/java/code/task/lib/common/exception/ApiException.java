package code.task.lib.common.exception;

public class ApiException extends AbstractException {

    private static final long serialVersionUID = 1L;

    public ApiException(String code, String message) {
        super(code, message);
    }

    public ApiException(String code, String message, Throwable e) {
        super(code, message, e);
    }

}
