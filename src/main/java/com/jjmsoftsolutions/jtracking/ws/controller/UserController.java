package com.jjmsoftsolutions.jtracking.ws.controller;

import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;

@RestController
@RequestMapping("/v1/api/user/github")
public class UserController {
	
	@Resource private GitHubService gitHubService;

	@RequestMapping(value="/connectUsingOAuth")
	public ResponseEntity<String> connectUsingOAuth(@RequestParam(value="token", required=true) final String token) {
		gitHubService.connectUsingOAuth(token);
		return new ResponseEntity<String>("The token is valid", HttpStatus.ACCEPTED);
	}
	
	public static void main(String args[]) {
		ResponseEntity<?> res = new UserController().connectUsingOAuth("f4f3bf5048e5ad2332ff0418f4e98e385974f7c8");
		
		System.err.println(res);
	}
}