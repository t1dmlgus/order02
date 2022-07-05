package com.t1dmlgus.orderPilot.common.exception;


import com.t1dmlgus.orderPilot.common.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

@Slf4j
@RestControllerAdvice
public class CommonControllerAdvice {


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> UserNotFoundException(UserNotFoundException e) {

        ErrorResponse response = ErrorResponse.of(ErrorType.USER_NOT_FOUND);
        return ResponseEntity.status(ErrorType.USER_NOT_FOUND.getHttpStatus()).body(response);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodArgumentNotValidationException(MethodArgumentNotValidException e) {

        log.info("errorFiled : {}, rejectedValue : {}, defaultMessage : {}", Objects.requireNonNull(e.getFieldError()).getField(), Objects.requireNonNull(e.getBindingResult().getFieldError()).getRejectedValue(), e.getBindingResult().getFieldError().getDefaultMessage());
        ErrorResponse response = ErrorResponse.of(ErrorType.INVALID_PARAMETER, e.getBindingResult());
        return ResponseEntity.status(ErrorType.INVALID_PARAMETER.getHttpStatus()).body(response);
    }
}
