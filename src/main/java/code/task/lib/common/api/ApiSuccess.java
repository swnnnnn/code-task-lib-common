package code.task.lib.common.api;

import code.task.lib.common.api.code.SuccessCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
public class ApiSuccess<T> {

    private boolean success = true;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime date;

    private SuccessMessage detail = new SuccessMessage(SuccessCode.SUCCESS, SuccessCode.SUCCESS.getMessage());

    private T data;

    public ApiSuccess() {
        this.date = LocalDateTime.now();
    }

    public ApiSuccess(String message) {
        this();
        this.detail = new SuccessMessage(SuccessCode.COMM_S000, message);
    }

    public ApiSuccess(SuccessCode code) {
        this();
        this.detail = new SuccessMessage(code, code.getMessage());
    }

}
