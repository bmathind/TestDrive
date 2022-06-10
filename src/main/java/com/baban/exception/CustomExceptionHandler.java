package com.baban.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Object> handleException(RecordNotFoundException exception, WebRequest webRequest) {
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(), "406", webRequest.toString(),
				LocalDateTime.now());
		ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}

}
