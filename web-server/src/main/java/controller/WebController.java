package controller;

import com.zafin.accounts.model.Account;
import com.zafin.accounts.model.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.WebService;

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
        webService.putAccount(dto);
    }
}
