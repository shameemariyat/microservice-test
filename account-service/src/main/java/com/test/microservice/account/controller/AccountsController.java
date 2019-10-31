package com.test.microservice.account.controller;

import com.test.microservice.account.model.Account;
import com.test.microservice.account.model.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.microservice.account.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountsController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/getaccount/{id}")
    public Account getAccount(@PathVariable("id") Long id ){
        return accountService.getAccount(id);
    }

    @PutMapping("/putaccount")
    public  void saveAccount(@RequestBody AccountDto accontDto){
        Account act = new Account();
        act.setName(accontDto.getName());
        accountService.saveAccount(act);
    }
}
