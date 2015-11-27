package com.jjmsoftsolutions.jtracking.ws.dao;

import java.util.Set;
import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.User;

public interface RepositoryDAO {
	Set<Repository> findAllByUser(User user);
}