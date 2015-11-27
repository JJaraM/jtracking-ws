package com.jjmsoftsolutions.jtracking.ws.service;

import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.User;

public interface AccountService {
	Account create(String name, User user);
}