package com.jjmsoftsolutions.jtracking.ws.factory;

import com.jjmsoftsolutions.jtracking.jpa.MembershipJPA;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;

public class MembershipFactory {
	
	private static MembershipFactory instance = null;
	
	private MembershipFactory() {}
	
	public static MembershipFactory getInstance() {
		if (instance == null) {
			instance = new MembershipFactory();
		}
		return instance;
	}
	
	public Membership createJPA(Account account, MembershipType type, String name, String token) {
		Membership membership = new MembershipJPA();
		membership.setType(type);
		membership.setName(name);
		membership.setAccount(account);
		membership.setActive(Boolean.TRUE);
		return membership;
	}

}
