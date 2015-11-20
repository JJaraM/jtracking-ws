package com.jjmsoftsolutions.jtracking.ws.service;

import com.jjmsoftsolutions.jtracking.specification.Account;

public interface AccountService {
	Account create(String name, String token);
}
