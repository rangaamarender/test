package com.lucid.core.exception;

public class InvalidDataException extends RuntimeException {
	private static final long serialVersionUID = 497770884365783831L;
	private final String code;
	private final String object;
	private final String field;
	private final String fieldValue;

	public InvalidDataException(String code, String object, String field, String fieldValue, String message) {
		super(message);
		this.code = code;
		this.object = object;
		this.field = field;
		this.fieldValue = fieldValue;
	}

	public String getCode() {
		return code;
	}

	public String getObject() {
		return object;
	}

	public String getField() {
		return field;
	}

	public String getFieldValue() {
		return fieldValue;
	}

}
