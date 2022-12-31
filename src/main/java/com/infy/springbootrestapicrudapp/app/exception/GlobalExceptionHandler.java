package com.infy.springbootrestapicrudapp.app.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(findByIdException.class)
	public ResponseEntity<GlobalExceptionEntity> noSupplierPresent(findByIdException e, HttpServletRequest req)
	{
		GlobalExceptionEntity see = new GlobalExceptionEntity(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(),
																LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, req.getRequestURI());
		return new ResponseEntity<GlobalExceptionEntity>(see, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
