package com.lucid.recruit.contract.exception;

public class ContractNotFoundException extends RuntimeException{

    private final String errorCode;
    public ContractNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ContractNotFoundException(String message, Throwable cause, String errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
