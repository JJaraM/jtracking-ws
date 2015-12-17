package com.jjmsoftsolutions.jtracking.ws.repository;

import com.jjmsoftsolutions.jtracking.jpa.MembershipJPA;
import com.jjmsoftsolutions.jtracking.jpa.QMembershipJPA;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;

public interface MembershipRepository extends CacheCrudRepository<MembershipJPA, Integer>{
	
	static final QMembershipJPA DEF = QMembershipJPA.membershipJPA;
	
	default Membership save(Membership membership) {
		return save((MembershipJPA)membership);
	}
	
	default Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name) {
		return findOne(DEF.account.eq(account).and(DEF.type.eq(type)).and(DEF.name.eq(name)));
	}
	
}