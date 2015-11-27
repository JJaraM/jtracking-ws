package com.jjmsoftsolutions.jtracking.ws.dao.impl;

import org.springframework.stereotype.Repository;

import com.jjmsoftsolutions.jtracking.jpa.MembershipJPA;
import com.jjmsoftsolutions.jtracking.jpa.QMembershipJPA;
import com.jjmsoftsolutions.jtracking.specification.Account;
import com.jjmsoftsolutions.jtracking.specification.Membership;
import com.jjmsoftsolutions.jtracking.specification.enums.MembershipType;
import com.jjmsoftsolutions.jtracking.ws.dao.MembershipDAO;
import com.jjmsoftsolutions.jtracking.ws.repository.MembershipRepository;

@Repository
public class MembershipJPADAO implements MembershipDAO {
	
	private MembershipRepository membershipRepository;
	private static final QMembershipJPA DEF = QMembershipJPA.membershipJPA;

	@Override
	public Membership save(Membership membership) {
		return membershipRepository.save((MembershipJPA) membership);
	}

	@Override
	public Membership findByAccountAndTypeAndName(Account account, MembershipType type, String name) {
		return membershipRepository.findOne(DEF.account.eq(account).and(DEF.type.eq(type)).and(DEF.name.eq(name)));
	}

}
