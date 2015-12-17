package com.jjmsoftsolutions.jtracking.ws.repository;

import java.util.Collection;

import com.jjmsoftsolutions.jtracking.jpa.RepositoryJPA;
import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.User;

public interface CVRepository extends CacheCrudRepository<RepositoryJPA, Integer>{

	Collection<? extends Repository> findAllByUser(User user);
	
}