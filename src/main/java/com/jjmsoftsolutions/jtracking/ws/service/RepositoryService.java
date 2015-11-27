package com.jjmsoftsolutions.jtracking.ws.service;

import java.util.Set;
import com.jjmsoftsolutions.jtracking.specification.Repository;

public interface RepositoryService {
	Set<Repository> getAllGithubByUserInSession();
	Set<Repository> getFromAllAccountsByUserInSession();
}
