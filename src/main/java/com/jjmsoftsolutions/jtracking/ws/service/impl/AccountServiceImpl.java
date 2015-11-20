package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jjmsoftsolutions.jtracking.jpa.AccountEntity;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.dao.AccountDAO;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Resource private AccountDAO accountDAO;
	
	@Override
	public Account create(String name, String token) {
		Account account = new AccountEntity();
		account.setName(name);
		account.setToken(token);
		return accountDAO.save(account);
	}

}
