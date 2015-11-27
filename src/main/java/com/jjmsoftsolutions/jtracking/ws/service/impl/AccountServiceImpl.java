package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.dao.AccountDAO;
import com.jjmsoftsolutions.jtracking.ws.factory.AccountFactory;
import com.jjmsoftsolutions.jtracking.ws.service.AccountService;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipService;
import com.jjmsoftsolutions.jtracking.ws.service.SessionService;
import com.jjmsoftsolutions.jtracking.specification.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Resource private AccountDAO accountDAO;
	@Resource private SessionService sessionService;
	@Resource private MembershipService membershipService;
	
	@Override
	public Account create(String name, User user) {
		Account account = AccountFactory.getInstance().createJPA(name, user);
		return accountDAO.save(account);
	}

}