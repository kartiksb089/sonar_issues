package com.sonar.issues.globalExceptions;

public class UserProcessingException extends RuntimeException {
	public UserProcessingException(String message) {
		super(message);
	}

}
