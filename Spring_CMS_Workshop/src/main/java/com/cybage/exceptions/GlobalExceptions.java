package com.cybage.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptions {
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> handleExceptions(RecordNotFoundException exception) {
		
		return new ResponseEntity<String>("Customer Not Found",HttpStatus.OK);
		
	}

}
