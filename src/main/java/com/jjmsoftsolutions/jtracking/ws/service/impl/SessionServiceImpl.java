package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.specification.User;
import com.jjmsoftsolutions.jtracking.ws.constants.SessionConstants;
import com.jjmsoftsolutions.jtracking.ws.service.GitHubService;
import com.jjmsoftsolutions.jtracking.ws.service.SessionService;
import com.jjmsoftsolutions.jtracking.ws.service.UserService;

@Service
public class SessionServiceImpl implements SessionService {

	@Resource private HttpServletRequest request;
	@Resource private UserService userService;
	@Resource private GitHubService gitHubService;
	
	@Override
	public User getUser() {
		User user = null;
		HttpSession currentSession = request.getSession();
		if (currentSession.getAttribute(SessionConstants.USER) != null) {
			Integer id =  (Integer) currentSession.getAttribute(SessionConstants.USER);
			user = userService.findById(id);
		}
		return user;
	}

	@Override
	public Integer getUserId() {
		Integer id = null;
		User user = getUser();
		if (user != null) {
			id = user.getId();
		}
		return id;
	}

}