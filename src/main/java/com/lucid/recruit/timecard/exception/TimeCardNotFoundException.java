package com.lucid.recruit.timecard.exception;

public class TimeCardNotFoundException extends RuntimeException{
    private final String errorCode;

    public TimeCardNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public TimeCardNotFoundException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
