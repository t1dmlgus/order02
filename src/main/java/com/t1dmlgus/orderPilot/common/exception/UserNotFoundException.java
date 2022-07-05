package com.t1dmlgus.orderPilot.common.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class UserNotFoundException extends RuntimeException{

    private final HttpStatus httpStatus;
    private final ErrorType errorType;

    public UserNotFoundException() {
        errorType = ErrorType.USER_NOT_FOUND;
        httpStatus = HttpStatus.NOT_FOUND;
    }

}
