package com.application.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.application.entity.AppEntity;

import jdk.jshell.Snippet.Status;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(Namenotfoundexception.class)
	public ResponseEntity<Object> namenot(Namenotfoundexception nf) {
		return new ResponseEntity<Object>("name not found",HttpStatus.NOT_FOUND);
	
	}
	@ExceptionHandler(Idnotfoundexception.class)
public ResponseEntity<Object>idnot(Idnotfoundexception IF){
		return new ResponseEntity<Object>(IF.getMessage(),HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Noofusersmismatchexception.class)
	public ResponseEntity<Object> noofuser(Noofusersmismatchexception ne){
		return new ResponseEntity<Object>("No of user mismatch",HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(Ratingnotfound.class)
	public ResponseEntity<Object>ratnot(Ratingnotfound re){
		return new ResponseEntity<Object>(re.getMessage(),HttpStatus.NOT_FOUND);
	}
}
