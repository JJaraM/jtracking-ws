package com.jjmsoftsolutions.jtracking.ws.dao.impl;

import java.util.Set;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.jjmsoftsolutions.jtracking.jpa.QRepositoryJPA;
import com.jjmsoftsolutions.jtracking.specification.Repository;
import com.jjmsoftsolutions.jtracking.specification.User;
import com.jjmsoftsolutions.jtracking.ws.dao.RepositoryDAO;
import com.jjmsoftsolutions.jtracking.ws.repository.CVRepository;
import com.mysema.query.BooleanBuilder;

@Component
public class RepositoryJPADAO implements RepositoryDAO {

	private final static QRepositoryJPA DEF = QRepositoryJPA.repositoryJPA;
	
	@Resource private CVRepository repository;
	
	@Override
	public Set<Repository> findAllByUser(User user) {
		BooleanBuilder predicate = new BooleanBuilder();
		//predicate.and(repository.ac)
		return null;
	}
}