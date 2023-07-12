package com.lucid.recruit.org.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class OrgException {

    private final Date timeStamp;
    private final String errorMessage;
    private final String errorCode;
    private final HttpStatus status;

    public OrgException(Date timeStamp, String errorMessage, String errorCode, HttpStatus status) {
        this.timeStamp = timeStamp;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

}
