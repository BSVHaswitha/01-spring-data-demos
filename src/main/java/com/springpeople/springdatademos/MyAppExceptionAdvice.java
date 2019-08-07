package com.springpeople.springdatademos;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyAppExceptionAdvice {
	@ExceptionHandler(value=NullPointerException.class)
	public void handleException(Throwable t) {
		t.printStackTrace();
		
	}

}
