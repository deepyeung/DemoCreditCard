package com.example.democreditcard.controllers;

import com.example.democreditcard.interfaces.AccountService;
import com.example.democreditcard.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired(required = false)
    private AccountService accountService;

    @GetMapping("/account")
    public List<Account> getAccount() {

        return accountService.getAccount();
    }

    @PostMapping("/account/add")
    public void add(@RequestBody Account account) {

        accountService.saveAccount(account);
    }

//    public ResponseEntity<Account[]> get(@RequestBody Account[] account){
//
//        try{
//            List<Account> account1 =  accountService.getAllAccount();
//            if (account == null) {
//                return new ResponseEntity<Account[]>(HttpStatus.NOT_FOUND);
//            }
//            accountService.saveAccount(account);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity<Account[]>(HttpStatus.NOT_FOUND);
//        }
}

