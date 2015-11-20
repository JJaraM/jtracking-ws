package com.jjmsoftsolutions.jtracking.ws.controller.exception.handler;

import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubTokenEmptyException;

@ControllerAdvice
public class ErrorHandler {

	@Resource private ErrorModel errorModel;
	
	@ExceptionHandler(GitHubTokenEmptyException.class)
	public ResponseEntity<ErrorModel> handleGitHubTokenEmptyException(GitHubTokenEmptyException ex) {
		errorModel.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorModel>(errorModel, HttpStatus.BAD_REQUEST);
	}
	
}
