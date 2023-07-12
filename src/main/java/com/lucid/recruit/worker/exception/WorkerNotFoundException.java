package com.lucid.recruit.worker.exception;

/**
 * 
 * @author chandu
 *
 */
public class WorkerNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6777175354681912924L;

	public WorkerNotFoundException(String message) {
		super(message);
	}

}
