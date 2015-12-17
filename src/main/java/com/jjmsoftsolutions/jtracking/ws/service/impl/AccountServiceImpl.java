package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.jpa.AccountJPA;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.factory.AccountFactory;
import com.jjmsoftsolutions.jtracking.ws.repository.AccountRepository;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;
import com.jjmsoftsolutions.jtracking.specification.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Resource private AccountRepository repository;
	
	@Override
	public Account create(String name, User user) {
		AccountJPA account = AccountFactory.getInstance().create(name, user);
		return repository.save(account);
	}

}