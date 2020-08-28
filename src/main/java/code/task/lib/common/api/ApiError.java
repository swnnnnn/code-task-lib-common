package code.task.lib.common.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import code.task.lib.common.api.code.ErrorCode;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ApiError {
    private boolean success = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime date;

    private ErrorMessage detail;

    private ApiError() {
        date = LocalDateTime.now();
    }

    public ApiError(ErrorCode code, String message) {
        this();
        this.detail = new ErrorMessage(code, message);
    }

    public ApiError(ErrorCode code, Throwable e) {
        this();
        this.detail = new ErrorMessage(code, e.getLocalizedMessage());
    }

    public ApiError(String code, String message) {
        this();
        this.detail = new ErrorMessage(code, message);
    }
}