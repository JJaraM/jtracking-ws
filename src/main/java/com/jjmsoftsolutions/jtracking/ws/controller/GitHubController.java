/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.controller;

import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;

/**
 * EndPoint to access user's operations
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
@RestController
@RequestMapping(value = "v1/api/user/github", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "User", produces = MediaType.APPLICATION_JSON_VALUE)
public class GitHubController {
	
	@Resource private GitHubService gitHubService;
	
	/**
	 * Connect to GitHub services to obtain the user information
	 * @param token {@link String} to access to GitHub services
	 * @return a {@link ResponseEntity<String>} with the response Status
	 */
	@ApiOperation(
			value = "Connect using OAuth", 
			notes = "<p>Create API request to GitHub with the token. For the current request the user needs to be logged</p>")
	@RequestMapping(value="/connectAndCreateUsingOAuth", method = RequestMethod.GET)
	public ResponseEntity<String> connectUsingOAuth(@RequestParam(value="token", required=true) final String token) {
		gitHubService.createMembershipUsingOAuth(token);
		return new ResponseEntity<String>("The token is valid", HttpStatus.ACCEPTED);
	}
}