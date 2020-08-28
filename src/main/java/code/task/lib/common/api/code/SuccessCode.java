package code.task.lib.common.api.code;

import lombok.Getter;

@Getter
public enum SuccessCode {

    SUCCESS("SUCCESS", "성공"),

    COMM_S000("COMM_S000", ""),
    COMM_S001("COMM_S001", "정상 등록되었습니다."),
    COMM_S002("COMM_S002", "정상 수정되었습니다."),
    COMM_S003("COMM_S003", "정상 삭제되었습니다."),
    COMM_S004("COMM_S004", "저장되었습니다."),
    COMM_S005("COMM_S005", "정상 조회되었습니다."),
    COMM_S006("COMM_S006", "정상 처리되었습니다."),
    COMM_S007("COMM_S007", "정상 인증되었습니다.")
    ;

    private String code;
    private String message;

    SuccessCode(String code) {
        this.code = code;
    }

    SuccessCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
