package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.specification.User;
import com.jjmsoftsolutions.jtracking.ws.factory.UserFactory;
import com.jjmsoftsolutions.jtracking.ws.repository.UserRepository;
import com.jjmsoftsolutions.jtracking.ws.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource private UserRepository repository;
	
	@Override
	public User findById(Integer id) {
		User user = null;
		if (id != null) {
			user = repository.findById(id);
		}
		return user;
	}

	@Override
	public User create(String email, String password) {
		User user = UserFactory.getInstance().create(email, password);
		return repository.save(user);
	}

}
