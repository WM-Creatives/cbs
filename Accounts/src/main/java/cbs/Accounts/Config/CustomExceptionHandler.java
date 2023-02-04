package cbs.Accounts.Config;

import cbs.Accounts.DTO.ResponseTemplate;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.sql.SQLException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    protected ResponseEntity<Mono<ResponseTemplate>> handleNullPointer(
            NullPointerException ex) {
        ex.printStackTrace();
        ResponseTemplate response = ResponseTemplate.builder()
                .error(ex.getLocalizedMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
        return buildResponseEntity(response);
    }

    @ExceptionHandler(IllegalStateException.class)
    protected ResponseEntity<Mono<ResponseTemplate>> handleIllegalStateException(
            IllegalStateException ex) {
        ex.printStackTrace();
        ResponseTemplate response = ResponseTemplate.builder()
                .error(ex.getLocalizedMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
        return buildResponseEntity(response);
    }

    @ExceptionHandler(RuntimeException.class)
    protected ResponseEntity<Mono<ResponseTemplate>> handleRunTime(
            RuntimeException ex) {
        ex.printStackTrace();
        ResponseTemplate response = ResponseTemplate.builder()
                .error(ex.getLocalizedMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
        return buildResponseEntity(response);
    }

    @ExceptionHandler(IOException.class)
    protected ResponseEntity<Mono<ResponseTemplate>> handleRunTime(
            IOException ex) {
        ex.printStackTrace();
        ResponseTemplate response = ResponseTemplate.builder()
                .error(ex.getLocalizedMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
        return buildResponseEntity(response);
    }

    @ExceptionHandler(SQLException.class)
    protected ResponseEntity<Mono<ResponseTemplate>> handleExeption(
            SQLException ex) {
        ex.printStackTrace();
        ResponseTemplate response = ResponseTemplate.builder()
                .error(ex.getLocalizedMessage())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).build();
        return buildResponseEntity(response);
    }


    private ResponseEntity<Mono<ResponseTemplate>> buildResponseEntity(ResponseTemplate response) {
        return ResponseEntity.status(response.getHttpStatus()).body(Mono.just(response));
    }
}
