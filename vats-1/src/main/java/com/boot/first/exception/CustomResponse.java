package com.boot.first.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomResponse {

	private int code;
	private String description;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
