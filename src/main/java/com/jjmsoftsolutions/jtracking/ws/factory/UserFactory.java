package com.jjmsoftsolutions.jtracking.ws.factory;

import com.jjmsoftsolutions.jtracking.jpa.UserJPA;
import com.jjmsoftsolutions.jtracking.specification.User;

public class UserFactory {

	private static UserFactory instance = null;
	
	private UserFactory(){}
	
	public static UserFactory getInstance() {
		if (instance == null) {
			instance = new UserFactory();
		}
		return instance;
	}
	
	public User create(String email, String password) {
		User user = new UserJPA();
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}
}
