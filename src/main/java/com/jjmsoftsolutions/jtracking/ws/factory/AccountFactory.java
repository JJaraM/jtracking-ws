/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.factory;

import com.jjmsoftsolutions.jtracking.jpa.AccountJPA;
import com.jjmsoftsolutions.jtracking.specification.User;

/**
 * Factory to create Account objects
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public class AccountFactory {
	
	private static AccountFactory instance;
	
	private AccountFactory() {}
	
	/**
	 * Return the {@link AccountFactory} instance
	 * @return {@link AccountFactory}
	 */
	public static AccountFactory getInstance() {
		if (instance == null) {
			instance = new AccountFactory();
		}
		return instance;
	}
	
	/**
	 * Create a new instance of {@link AccountJPA}
	 * @param name of specified the token's name
	 * @param user specified the token to access to the account
	 * @param type specified the account's type
	 * @return a new instance of {@link AccountJPA}
	 */
	public AccountJPA create(String name, User user) {
		AccountJPA account = new AccountJPA();
		account.setUser(user);
		return account;
	}

}
