package com.jjmsoftsolutions.jtracking.ws.repository;

import com.jjmsoftsolutions.jtracking.jpa.UserJPA;
import com.jjmsoftsolutions.jtracking.specification.User;

public interface UserRepository extends CacheCrudRepository<UserJPA, Integer> {

	default User findById(Integer id) {
		return findOne(id);
	}

	default User save(User user) {
		save((UserJPA) user);
		return user;
	}
}
