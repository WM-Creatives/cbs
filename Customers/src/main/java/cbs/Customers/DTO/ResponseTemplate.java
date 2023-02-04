package cbs.Customers.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data @Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseTemplate {
    private Integer httpStatus;
    private Object data;
    private String message;
    private String error;
}
