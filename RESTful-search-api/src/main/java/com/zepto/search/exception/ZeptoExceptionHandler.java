package com.zepto.search.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zepto.search.response.ErrorResponse;

@RestControllerAdvice
public class ZeptoExceptionHandler {

	@ExceptionHandler(ProductNotFoundExcpetion.class)
	public ResponseEntity<ErrorResponse> handleException(ProductNotFoundExcpetion ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ZEC-001");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ZEC-002");
		return ResponseEntity.ok(errorResponse);
	}
}
