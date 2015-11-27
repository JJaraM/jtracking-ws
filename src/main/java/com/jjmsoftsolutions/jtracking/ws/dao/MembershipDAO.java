package com.jjmsoftsolutions.jtracking.ws.dao;

import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;

public interface MembershipDAO {
	Membership save(Membership membership);
	Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name);
}
