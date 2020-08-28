package code.task.lib.common.api.code;

import lombok.Getter;

@Getter
public enum ErrorCode {

    FAIL("FAIL", "실패"),

    COMM_E001("COMM_E001", "내부 처리 오류"),
    COMM_E002("COMM_E002", "필수 파라미터가 누락되었습니다."),
    COMM_E003("COMM_E003", "유효하지 않은 필드값입니다."),
    COMM_E004("COMM_E004", "유효하지 않은 메소드입니다."),
    COMM_E005("COMM_E005", "접근이 금지되어 있습니다"),
    COMM_E006("COMM_E006", "데이터가 없습니다."),
    COMM_E007("COMM_E007", "등록 중 오류가 발생했습니다."),
    COMM_E008("COMM_E008", "수정 중 오류가 발생했습니다."),
    COMM_E009("COMM_E009", "삭제 중 오류가 발생했습니다."),
    COMM_E010("COMM_E010", "저장 중 오류가 발생했습니다."),
    COMM_E011("COMM_E011", "조회 중 오류가 발생했습니다."),
    COMM_E012("COMM_E012", "처리 중 오류가 발생했습니다."),
    COMM_E013("COMM_E013", "중복 데이터가 존재합니다."),
    COMM_E014("COMM_E014", "유효하지 않은 데이터입니다.")
    ;
    
    private String code;
    private String message;

    ErrorCode(String code) {
        this.code = code;
    }
    
    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}


