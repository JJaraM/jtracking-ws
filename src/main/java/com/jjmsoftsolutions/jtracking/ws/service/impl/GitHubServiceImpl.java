package com.jjmsoftsolutions.jtracking.ws.service.impl;

import java.io.IOException;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Service;

import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.User;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubInvalidToken;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.GitHubTokenEmptyException;
import com.jjmsoftsolutions.jtracking.ws.controller.exception.MembershipStatus;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipService;
import com.jjmsoftsolutions.jtracking.ws.service.SessionService;

@Service
public class GitHubServiceImpl implements GitHubService {

	@Resource private AccountService accountService;
	@Resource private SessionService sessionService;
	@Resource private MembershipService memberShipService;
	
	@Override
	public GitHub connectUsingOAuth(String token) {
		GitHub gitHub = null;
		if (!StringUtils.isBlank(token)) {
			try {
				gitHub = GitHub.connectUsingOAuth(token);
				if (!gitHub.isCredentialValid()) {
					throw new GitHubInvalidToken();
				}
			} catch (IOException e) {
				throw new GitHubInvalidToken();
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
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public GitHub createMembershipUsingOAuth(String token) {
		GitHub gitHub = connectUsingOAuth(token);
		User user = sessionService.getUser();
		if (gitHub != null && user != null) {
			try {
				Account account = user.getAccount();
				MembershipType type = MembershipType.GITHUB;
				String name = gitHub.getMyself().getLogin();
				Membership membership = memberShipService.findByAccountAndTypeAndName(account, type, name);
				if ( membership == null) {
					memberShipService.addToAccount(user.getAccount(), MembershipType.GITHUB, gitHub.getMyself().getLogin(), token);
				} else if (!membership.isActive()) {
					throw new MembershipStatus("Already exist the same github account, please change it to enable");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return gitHub;
	}
	
	@Override
	public GitHub getGitHubAccountByUserInSession() {
		GitHub gitHub = null;
		User user = sessionService.getUser();
		if (user != null) {
			gitHub = connectUsingOAuth(user.getAuthorizationToken());
		}
		return gitHub;
	}

}
