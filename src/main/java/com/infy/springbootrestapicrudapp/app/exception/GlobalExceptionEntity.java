package com.infy.springbootrestapicrudapp.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalExceptionEntity 
{
	private int errorCode;
	private String exceptionMessage;
	private LocalDateTime timeAndDate;
	private HttpStatus statusCode;
	private String uri;
}
