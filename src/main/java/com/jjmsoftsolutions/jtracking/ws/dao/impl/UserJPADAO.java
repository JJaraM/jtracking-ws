/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.dao.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.jjmsoftsolutions.jtracking.specification.User;
import com.jjmsoftsolutions.jtracking.ws.dao.UserDAO;
import com.jjmsoftsolutions.jtracking.ws.repository.UserRepository;

/**
 * Implementation of {@link UserDAO} using spring JPA
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see UserDAO
 */
@Repository
public class UserJPADAO implements UserDAO {

	@Resource private UserRepository userRepository;
	
	@Override
	public User findById(Integer id) {
		return userRepository.findOne(id);
	}

}
