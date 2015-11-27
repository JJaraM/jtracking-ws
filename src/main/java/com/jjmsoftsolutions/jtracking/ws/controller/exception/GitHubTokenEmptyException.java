/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.controller.exception;

/**
 * Exception of empty GitHub's token
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see RuntimeException
 */
public class GitHubTokenEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public GitHubTokenEmptyException() {
		super("The token can not be empty");
	}
}