package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;
import com.jjmsoftsolutions.jtracking.ws.dao.MembershipDAO;
import com.jjmsoftsolutions.jtracking.ws.factory.MembershipFactory;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipHistoryService;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipService;

public class MembershipServiceImpl implements MembershipService {

	@Resource private MembershipHistoryService membershipHistoryService;
	@Resource private MembershipDAO membershipDAO;
	
	@Override
	public Membership addToAccount(Account account, MembershipType type, String name, String token) {
		Membership membership = MembershipFactory.getInstance().createJPA(account, type, name, token);
		membership.addHistoryRecord(membershipHistoryService.logMembershipCreation(membership));
		return membershipDAO.save(membership);
	}

	@Override
	public Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name) {
		return membershipDAO.findByAccountAndTypeAndName(account, type, name);
	}

}
