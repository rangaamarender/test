package com.lucid.recruit.org.exception;

public class OrgNotFoundException extends RuntimeException{
    private final String errorCode;
    public OrgNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public OrgNotFoundException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public OrgNotFoundException(Throwable cause, String errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
