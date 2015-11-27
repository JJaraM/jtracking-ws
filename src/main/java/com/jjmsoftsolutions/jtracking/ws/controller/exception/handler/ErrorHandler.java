/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.controller.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubTokenEmptyException;

/**
 * Error handler manager for all controller exceptions
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see ControllerAdvice
 */
@ControllerAdvice
public class ErrorHandler {

	/**
	 * Handler to empty GitHub's token
	 * @param ex {@link GitHubTokenEmptyException}
	 * @return
	 */
	@ExceptionHandler(GitHubTokenEmptyException.class)
	public ResponseEntity<ErrorModel> handleGitHubTokenEmptyException(GitHubTokenEmptyException ex) {
		ErrorModel errorModel = new ErrorModel();
		errorModel.setMessage(ex.getMessage());
		return new ResponseEntity<ErrorModel>(errorModel, HttpStatus.BAD_REQUEST);
	}
	
}