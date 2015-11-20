package com.jjmsoftsolutions.jtracking.ws.repository;

import org.springframework.data.repository.CrudRepository;

import com.jjmsoftsolutions.jtracking.jpa.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {

}
