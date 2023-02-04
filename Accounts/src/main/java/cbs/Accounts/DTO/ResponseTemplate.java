package cbs.Accounts.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Builder @Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseTemplate {
    private Integer httpStatus;
    private Object data;
    private String message;
    private String error;
}
