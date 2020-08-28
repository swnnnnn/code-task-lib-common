package code.task.lib.common.api;

import lombok.Data;
import code.task.lib.common.api.code.SuccessCode;

@Data
public class SuccessMessage {
    private String code;
    private String message;

    public SuccessMessage(SuccessCode code, String message) {
        this.code = code.getCode();
        this.message = message;
    }
}
