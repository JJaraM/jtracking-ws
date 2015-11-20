package com.jjmsoftsolutions.jtracking.ws.controller.exception;

public class GitHubTokenEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public GitHubTokenEmptyException() {
		super("The token can not be empty");
	}
}
