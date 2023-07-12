package com.lucid.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class LRecuritRespExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(LRecuritRespExceptionHandler.class);

	/**
	 * Handle MethodArgumentNotValidException. Triggered when an object fails @Valid
	 * validation.
	 *
	 * @param ex      the MethodArgumentNotValidException that is thrown when @Valid
	 *                validation fails
	 * @param headers HttpHeaders
	 * @param status  HttpStatus
	 * @param request WebRequest
	 * @return the ApiError object
	 */
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		log.error("Validation error due to " + ex.getMessage() + "  " + ex.toString());
		log.error("Exception is " + ex);
		LRApiError apiError = new LRApiError(HttpStatus.BAD_REQUEST, ex);
		apiError.setMessage("Validation error");
		apiError.addValidationErrors(ex.getBindingResult().getFieldErrors());
		apiError.addValidationError(ex.getBindingResult().getGlobalErrors());
		return buildResponseEntity(apiError);
	}

	public ResponseEntity<Object> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		log.error("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());
		log.error("Exception is " + ex);
		LRApiError apiError = new LRApiError(HttpStatus.BAD_REQUEST);
		apiError.setMessage(ex.getMessage());
		return buildResponseEntity(apiError);
	}

	/**
	 * Handles EntityNotFoundException. Created to encapsulate errors with more
	 * detail than javax.persistence.EntityNotFoundException.
	 *
	 * @param ex the EntityNotFoundException
	 * @return the ApiError object
	 */
	@ExceptionHandler(EntityNotFoundException.class)
	protected ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex) {
		log.error("Exception Occurred due to " + ex.getMessage() + "  " + ex.toString());
		log.error("Exception is " + ex);
		LRApiError apiError = new LRApiError(HttpStatus.NOT_FOUND, ex.getLocalizedMessage(), ex);
		apiError.setMessage(ex.getMessage());
		return buildResponseEntity(apiError);
	}

	/**
	 * Handles InvalidDataException.
	 * 
	 * @param ex the InvalidDataException
	 * @return the ApiError object
	 */
	@ExceptionHandler(InvalidDataException.class)
	protected ResponseEntity<Object> handleEntityNotFound(InvalidDataException ex) {
		log.error("Validation failed due to " + ex.getCode() + "  " + ex.toString());
		log.error("Exception is " + ex);
		LRApiError apiError = new LRApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), ex);
		apiError.addValidationError(ex.getObject(), ex.getField(), ex.getFieldValue(), ex.getMessage());
		return buildResponseEntity(apiError);
	}

	private ResponseEntity<Object> buildResponseEntity(LRApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		log.error("Exception occurred " + ex.getMessage() + "  " + ex.toString());
		log.error("Exception is " + ex);
		LRApiError apiError = new LRApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(), ex);
		apiError.setMessage("Validation error");
		return buildResponseEntity(apiError);
	}
}
