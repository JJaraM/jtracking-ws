package com.jjmsoftsolutions.jtracking.ws.controller.exception;

public class GitHubInvalidToken extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public GitHubInvalidToken() {
		super("The token is invalid");
	}

}
