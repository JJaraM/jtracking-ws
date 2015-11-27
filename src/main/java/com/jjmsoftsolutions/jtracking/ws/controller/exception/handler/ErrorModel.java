/*
 * Copyright (c) 2015, 2015 JJMSoftSolutions and/or its affiliates. All rights reserved.
 * JJMSOFTSOLUTIONS PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.jjmsoftsolutions.jtracking.ws.controller.exception.handler;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Representation of error handler
 * 
 * @author Jonathan Jara Morales
 * @since 0.0.1
 * @version 0.0.1
 */
@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class ErrorModel {

	private String message;

	/**
	 * Gets error message
	 * 
	 * @return {@link String} message error
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets {@link String} instance representing message
	 * 
	 * @param message
	 *            {@link String} instance representing error
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
