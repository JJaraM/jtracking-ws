package com.jjmsoftsolutions.jtracking.ws.service;

import org.kohsuke.github.GitHub;

public interface GitHubService {
	GitHub connectUsingOAuth(String token);
	GitHub addRepository(String token, String repository);
}
