package com.vti_education.shoppe_demo.controllers;

import com.vti_education.shoppe_demo.entities.Account;
import com.vti_education.shoppe_demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/findById")
    public Account findById(@RequestParam Long id){

        Optional<Account> optionalAccount = accountService.findById(id);
        return optionalAccount.orElse(null);
    }
    @GetMapping("/findAll")
    public List<Account> getAccountList() {
        return accountService.findAll();
    }

    @PostMapping("/insert")
    public  Account insert (Account account){

        return accountService.insert(account);

    }

    @PutMapping("/update")
    public  Account update (Account account){

        return accountService.update(account);

    }

    @DeleteMapping("/delete")
    public  void delete (@RequestParam Long id){

         accountService.delete(id);

    }




}
