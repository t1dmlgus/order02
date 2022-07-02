package com.t1dmlgus.orderPilot.common.response;

import com.t1dmlgus.orderPilot.common.exception.ErrorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private final String errorCode;
    private final List<FieldError> errors;
    private final String message;

    @Builder
    public ErrorResponse(ErrorType errorType, List<FieldError> errors) {
        this.errorCode = errorType.getCode();
        this.message = errorType.getMessage();
        this.errors = errors;

    }

    public static ErrorResponse of(ErrorType errorType, BindingResult bindingResult) {
        return ErrorResponse.builder()
                .errorType(errorType)
                .errors(FieldError.of(bindingResult))
                .build();

//        return new ErrorResponse(errorType, FieldError.of(bindingResult));
    }

    public static ErrorResponse of(ErrorType errorType) {
         return ErrorResponse.builder()
                .errorType(errorType)
                .errors(new ArrayList<>())
                .build();
    }

    @Getter
    @NoArgsConstructor
    public static class FieldError {

        private String field;
        private String value;
        private String errorMessage;

        public FieldError(String field, String value, String errorMessage) {
            this.field = field;
            this.value = value;
            this.errorMessage = errorMessage;
        }

        private static List<FieldError> of(BindingResult bindingResult) {

            List<org.springframework.validation.FieldError> fieldErrors = bindingResult.getFieldErrors();
            return fieldErrors.stream()
                    .map(error -> new FieldError(
                            error.getField(),
                            error.getRejectedValue() == null ? "" : error.getRejectedValue().toString(),
                            error.getDefaultMessage()
                    )).collect(Collectors.toList());

        }
    }
}
