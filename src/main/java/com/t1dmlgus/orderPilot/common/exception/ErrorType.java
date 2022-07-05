package com.t1dmlgus.orderPilot.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorType {

    USER_NOT_FOUND("U001", "해당 유저를 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    INVALID_PARAMETER("C001", "요청한 값이 올바르지 않습니다.", HttpStatus.BAD_REQUEST);

    private final String code;
    private final String message;
    private final HttpStatus httpStatus;

    ErrorType(String code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
