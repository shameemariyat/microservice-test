package com.test.microservice.web.service;

import com.test.microservice.account.model.Account;
import com.test.microservice.account.model.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebService {
    @Autowired
    public RestTemplate restTemplate;

    public Account getAccount(Long id){
      Account act= restTemplate.getForObject("http://ACCOUNTS-SERVICE/account/getaccount/{id}",Account.class,id);
      return act;
    }

    public  void putAccount( AccountDto act){
        Account ac = new Account();
        ac.setName("shameem");
        restTemplate.put("http://ACCOUNTS-SERVICE/account/putaccount",ac);
    }
}
