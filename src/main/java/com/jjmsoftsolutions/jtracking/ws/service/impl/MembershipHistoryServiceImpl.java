package com.jjmsoftsolutions.jtracking.ws.service.impl;

import org.springframework.stereotype.Service;

import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.MembershipHistory;
import com.jjmsoftsolutions.jtracking.ws.factory.MembershipHistoryFactory;
import com.jjmsoftsolutions.jtracking.ws.messages.MessagesKey;
import com.jjmsoftsolutions.jtracking.ws.service.MembershipHistoryService;

@Service
public class MembershipHistoryServiceImpl implements MembershipHistoryService {

	@Override
	public MembershipHistory logMembershipCreation(Membership membership) {
		MembershipHistory record = MembershipHistoryFactory.getInstance().create(membership);
		record.setMessage(MessagesKey.CREATE_HISTORY_LOG);
		return record;
	}

}