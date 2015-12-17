package com.jjmsoftsolutions.jtracking.ws.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;
import com.jjmsoftsolutions.jtracking.ws.factory.MembershipFactory;
import com.jjmsoftsolutions.jtracking.ws.repository.MembershipRepository;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipHistoryService;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipService;

@Service
public class MembershipServiceImpl implements MembershipService {

	@Resource private MembershipHistoryService membershipHistoryService;
	@Resource private MembershipRepository repository;
	
	@Override
	public Membership addToAccount(Account account, MembershipType type, String name, String token) {
		Membership membership = MembershipFactory.getInstance().create(account, type, name, token);
		membership.addHistoryRecord(membershipHistoryService.logMembershipCreation(membership));
		return repository.save(membership);
	}

	@Override
	public Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name) {
		return repository.findByAccountAndTypeAndName(account, type, name);
	}

}
