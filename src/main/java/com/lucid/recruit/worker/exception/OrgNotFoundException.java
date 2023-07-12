package com.lucid.recruit.worker.exception;

/**
 * 
 * @author chandu
 *
 */
public class OrgNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6777175354681912924L;

	public OrgNotFoundException(String message) {
		super(message);
	}

}
