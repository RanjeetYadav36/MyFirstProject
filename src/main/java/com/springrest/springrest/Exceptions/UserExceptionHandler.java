package com.springrest.springrest.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // it is used for applying exception handling technique across  the application
public class UserExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException unfe){
		UserErrorResponse errorResponse = new UserErrorResponse();
		errorResponse.setMessage(unfe.getMessage());
		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<UserErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handleException(Exception ex){
		UserErrorResponse errorResponse = new UserErrorResponse();
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<UserErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	
		
	}
}
