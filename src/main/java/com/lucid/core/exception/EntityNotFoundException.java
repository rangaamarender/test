package com.lucid.core.exception;

/**
 * 
 * @author chandu
 *
 */
public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 497770884365783831L;
	private final String code;

	public EntityNotFoundException(String message) {
		super(message);
		this.code = null;
	}

	public EntityNotFoundException(String code, String message) {
		super(message);
		this.code = code;

	}

	public String getCode() {
		return code;
	}

}
