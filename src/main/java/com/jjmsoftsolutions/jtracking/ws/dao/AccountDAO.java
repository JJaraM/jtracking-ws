/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.dao;

import com.jjmsoftsolutions.jtracking.specification.Account;

/**
 * Data access layer for account operations
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public interface AccountDAO {
	
	/**
	 * Save an {@link Account}
	 * @param account {@link Account}
	 * @return a {@link Account} persisted
	 */
	Account save(Account account);
}
