/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.dao;

import com.jjmsoftsolutions.jtracking.specification.User;

/**
 * Data access layer for user operations
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
public interface UserDAO {
	
	/**
	 * Find an {@link User}
	 * @param id {@link Integer} 
	 * @return an {@link User}
	 */
	User findById(Integer id);
}