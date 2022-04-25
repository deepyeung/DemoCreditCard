package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccount();

    void saveAccount(Account account);
}
