package code.task.lib.common.api;

import lombok.Data;

@Data
public class ApiResult<T> {

    private String status;

    /** 결과 데이터 */
    private T data;

    /** 에러 메시지 */
    private ErrorMessage error;
}
