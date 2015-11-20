package com.jjmsoftsolutions.jtracking.ws.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jjmsoftsolutions.jtracking.jpa.AccountEntity;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.dao.AccountDAO;
import com.jjmsoftsolutions.jtracking.ws.repository.AccountRepository;

@Component
public class AccountDAOImpl implements AccountDAO {

	@Resource private AccountRepository accountRepository;

	@Override
	public Account save(Account account) {
		return accountRepository.save((AccountEntity) account);
	}

}
