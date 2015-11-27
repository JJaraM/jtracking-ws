/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.repository;

import com.jjmsoftsolutions.jtracking.jpa.AccountJPA;

/**
 * Repository of Account
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see CacheCrudRepository
 * @see AccountJPA
 */
public interface AccountRepository extends CacheCrudRepository<AccountJPA, Integer> {}