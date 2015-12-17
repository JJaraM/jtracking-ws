/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * EndPoint to login
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public class LoginController {

	public ResponseEntity<String> connectUsingOAuth(@RequestParam(value="token", required=true) final String token) {
		
		return new ResponseEntity<String>("The token is valid", HttpStatus.ACCEPTED);
	}
}
