package com.jjmsoftsolutions.jtracking.ws.service;

import com.jjmsoftsolutions.jtracking.specification.User;

public interface UserService {
	User findById(Integer id);
	User create(String email, String password);
}