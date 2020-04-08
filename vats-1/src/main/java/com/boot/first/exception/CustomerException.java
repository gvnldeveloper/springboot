package com.boot.first.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerException {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<CustomResponse> myException(CustomException exp) {
		CustomResponse resp = new CustomResponse();
		resp.setCode(exp.getCode());
		resp.setDescription(exp.getMessage());
		return new ResponseEntity<CustomResponse>(resp, HttpStatus.BAD_GATEWAY);
	}

}
