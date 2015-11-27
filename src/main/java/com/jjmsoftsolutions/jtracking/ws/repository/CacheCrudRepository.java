/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.repository;

import java.io.Serializable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Cache repository
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 * @see CrudRepository
 * @see QueryDslPredicateExecutor
 */
@NoRepositoryBean
public interface CacheCrudRepository<T, ID extends Serializable> extends CrudRepository<T, ID>, QueryDslPredicateExecutor<T> {

}