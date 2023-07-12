package com.lucid.core.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;

	private String errorCode;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public ExceptionResponse(Date timestamp, String message, String details,String errorCode) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
