package com.lucid.recruit.worker.exception;

/**
 * 
 * @author chandu
 *
 */
public class JobNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6777175354681912924L;

	public JobNotFoundException(String message) {
		super(message);
	}

}
