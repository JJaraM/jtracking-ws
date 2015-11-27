package com.jjmsoftsolutions.jtracking.ws.service.impl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Resource;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.enums.RepositoryType;
import com.jjmsoftsolutions.jtracking.ws.dao.RepositoryDAO;
import com.jjmsoftsolutions.jtracking.ws.factory.RepositoryFactory;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;
import com.jjmsoftsolutions.jtracking.ws.service.RepositoryService;
import com.jjmsoftsolutions.jtracking.ws.service.SessionService;

public class RepositoryServiceImpl implements RepositoryService {

	@Resource private SessionService sessionService;
	@Resource private RepositoryDAO repositoryDAO;
	@Resource private GitHubService gitHubService;
	
	@Override
	public Set<Repository> getAllGithubByUserInSession() {
		Set<Repository> repositories = new HashSet<>();
		GitHub gitHub = gitHubService.getGitHubAccountByUserInSession();
		if (gitHub != null) {
			try {
				Map<String,GHRepository> map = gitHub.getMyself().getAllRepositories();
				for (GHRepository repository : map.values()) {
					repositories.add(RepositoryFactory.getInstance().createRepositoryDTO(repository.getName(), RepositoryType.GITHUB));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return repositories;
	}

	@Override
	public Set<Repository> getFromAllAccountsByUserInSession() {		
		Set<Repository> repositories = new HashSet<>();
		repositories.addAll(repositoryDAO.findAllByUser(sessionService.getUser()));
		repositories.addAll(getAllGithubByUserInSession());
		return repositories;
	}
}