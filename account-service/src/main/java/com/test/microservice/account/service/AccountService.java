package com.test.microservice.account.service;

import com.test.microservice.account.dao.AccountRepository;
import com.test.microservice.account.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository repository;

    public void saveAccount(Account account){
        repository.save(account);
    }

    public Account getAccount(Long id){
       return repository.findById(id).get();
    }
}
