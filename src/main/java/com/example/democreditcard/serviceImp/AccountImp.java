package com.example.democreditcard.serviceImp;

import com.example.democreditcard.interfaces.AccountRepository;
import com.example.democreditcard.interfaces.AccountService;
import com.example.democreditcard.models.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountImp implements AccountService {

    @Autowired(required = false)
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAccount() {
        return this.accountRepository.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        // TODO Auto-generated method stub
        accountRepository.save(account);
    }

}
