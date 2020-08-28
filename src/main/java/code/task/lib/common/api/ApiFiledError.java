package code.task.lib.common.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.FieldError;
import code.task.lib.common.api.code.ErrorCode;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class ApiFiledError {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime date;

    private int status;

    private String message;

    private List<FiledErrorMessage> errors;

    private ApiFiledError() {
        date = LocalDateTime.now();
    }

    public ApiFiledError(List<FieldError> fieldErrors) {
        this();
    }
}
