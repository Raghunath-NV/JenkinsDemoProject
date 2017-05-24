package com.demo.helloController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)  //500
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e)
	{
		System.out.print("handling Null Pointer Exception");
		
		return "NullPointerExceptionPage";
	}
}
