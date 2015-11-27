package com.jjmsoftsolutions.jtracking.ws.service;

import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;

public interface MembershipService {
	Membership addToAccount(Account account, MembershipType type, String name, String token);
	Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name);
}