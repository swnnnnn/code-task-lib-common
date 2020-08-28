package code.task.lib.common.api;

import lombok.Data;
import code.task.lib.common.api.code.ErrorCode;

@Data
public class ErrorMessage {

    private String code;
    private String message;

    public ErrorMessage(ErrorCode code, String message) {
        this.code = code.getCode();
        this.message = message;
    }

    public ErrorMessage(String code, String message) {
        this.code = ErrorCode.FAIL.getCode();
        this.message = message;
    }
}