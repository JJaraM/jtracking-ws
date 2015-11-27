package com.jjmsoftsolutions.jtracking.ws.factory;

import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.dto.RepositoryDTO;
import com.jjmsoftsolutions.jtracking.specification.enums.RepositoryType;

public class RepositoryFactory {
	
	public static RepositoryFactory instance = null;
	
	private RepositoryFactory() {}
	
	public static RepositoryFactory getInstance() {
		if (instance == null) {
			instance = new RepositoryFactory();
		}
		return instance;
	}
	
	public Repository createRepositoryDTO (String name, RepositoryType type) {
		Repository repository = new RepositoryDTO();
		repository.setName(name);
		repository.setType(type);
		return repository;
	}

}
