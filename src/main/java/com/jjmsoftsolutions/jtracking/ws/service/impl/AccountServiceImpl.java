package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Resource private Account account;
	
	@Override
	public Account create(String name, String token) {
		account.setName(token);
		account.setToken(token);
		return account;
	}

}
