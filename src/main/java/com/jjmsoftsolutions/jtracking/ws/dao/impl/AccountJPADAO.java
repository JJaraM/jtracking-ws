/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.dao.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.jjmsoftsolutions.jtracking.jpa.AccountJPA;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.ws.dao.AccountDAO;
import com.jjmsoftsolutions.jtracking.ws.repository.AccountRepository;

/**
 * Implementation of {@link AccountDAO} using spring JPA
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see AccountDAO
 */
@Repository
public class AccountJPADAO implements AccountDAO {

	@Resource private AccountRepository accountRepository;

	@Override
	public Account save(Account account) {
		return accountRepository.save((AccountJPA) account);
	}

}
