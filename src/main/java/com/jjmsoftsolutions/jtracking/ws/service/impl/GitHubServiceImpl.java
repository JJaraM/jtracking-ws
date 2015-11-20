package com.jjmsoftsolutions.jtracking.ws.service.impl;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubInvalidToken;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubTokenEmptyException;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;

@Service
public class GitHubServiceImpl implements GitHubService {

	@Resource private AccountService accountService;
	
	@Override
	public GitHub connectUsingOAuth(String token) {
		GitHub gitHub = null;
		if (!StringUtils.isBlank(token)) {
			try {
				gitHub = GitHub.connectUsingOAuth(token);
				if (!gitHub.isCredentialValid()) {
					throw new GitHubInvalidToken();
				}
				accountService.create(gitHub.getMyself().getLogin(), token);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new GitHubTokenEmptyException();
		}
		return gitHub;
	}

	@Override
	public GitHub addRepository(String token, String repository) {
		GitHub gitHub = connectUsingOAuth(token);
		try {
	
			GHRepository gitHubRepository = gitHub.getRepository(repository);
			gitHubRepository.getName();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
