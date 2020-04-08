package com.boot.first.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String message;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomException() {}
	public CustomException(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
