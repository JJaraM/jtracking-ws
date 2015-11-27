package com.jjmsoftsolutions.jtracking.ws.service;

import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.MembershipHistory;

public interface MembershipHistoryService {
	MembershipHistory logMembershipCreation(Membership membership);
}