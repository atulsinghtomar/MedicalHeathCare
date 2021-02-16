package com.healthcare.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
	
@ExceptionHandler(value = UserNotFound.class)

public ResponseEntity<ExceptionResponse> handleException(UserNotFound exception)
{
	ExceptionResponse response = new ExceptionResponse();
	response.setStatus(HttpStatus.NOT_FOUND.value());
	response.setMessage(exception.getMessage());
	response.setTimeStamp(System.currentTimeMillis());
	
	return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
}


@ExceptionHandler(value = User.class)

public ResponseEntity<ExceptionResponse> handleException(User exception)
{
	ExceptionResponse response = new ExceptionResponse();
	response.setStatus(HttpStatus.OK.value());
	response.setMessage(exception.getMessage());
	response.setTimeStamp(System.currentTimeMillis());
	
	return new ResponseEntity<ExceptionResponse>(response,HttpStatus.OK);
}


@ExceptionHandler(Exception.class)

public ResponseEntity<ExceptionResponse>handleException(Exception exception)
{
	ExceptionResponse response = new ExceptionResponse();
	response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
	response.setMessage(exception.getMessage());
	response.setTimeStamp(System.currentTimeMillis());
	
	return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);

}
}
