package code.task.lib.common.api;

import lombok.Data;

@Data
public class FiledErrorMessage {
    private String object;
    private String filed;
    private String reason;

    public FiledErrorMessage(String object, String filed, String reason) {
        this.object = object;
        this.filed = filed;
        this.reason = reason;
    }
}
