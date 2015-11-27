package com.jjmsoftsolutions.jtracking.ws.factory;

import java.util.Date;
import com.jjmsoftsolutions.jtracking.jpa.MembershipHistoryJPA;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.MembershipHistory;

public class MembershipHistoryFactory {
	
	private static MembershipHistoryFactory instance = null;
	
	private MembershipHistoryFactory() {}
	
	public static MembershipHistoryFactory getInstance() {
		if (instance == null) {
			instance = new MembershipHistoryFactory();
		}
		return instance;
	}
	
	public MembershipHistory createJPA(Membership membership) {
		MembershipHistory record = new MembershipHistoryJPA();
		record.setDate(new Date());
		record.setMembership(membership);
		return record;
	}

}
