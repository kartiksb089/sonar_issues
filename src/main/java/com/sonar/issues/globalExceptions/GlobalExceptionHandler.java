package com.sonar.issues.globalExceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserProcessingException.class)
	public String handleUserProcessingException(UserProcessingException ex) {
		return "Error processing user: " + ex.getMessage();
	}
}
