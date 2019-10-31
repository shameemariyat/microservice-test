package com.test.microservice.web.controller;

import com.test.microservice.account.model.Account;
import com.test.microservice.account.model.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.test.microservice.web.service.WebService;

@RestController
@RequestMapping("/entry")
public class WebController {
    @Autowired
    private WebService webService;

    @GetMapping("/getaccount/{id}")
    public Account getAccount(@PathVariable Long id){
       return webService.getAccount(id);
    }

    @PostMapping
    public  void putAccount(@RequestBody AccountDto dto){
        System.out.println("helo");
        webService.putAccount(dto);
    }
}
