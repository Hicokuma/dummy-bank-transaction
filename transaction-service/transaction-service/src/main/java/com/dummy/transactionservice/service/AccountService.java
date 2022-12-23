package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);

    List<Account> getAccountByUserId(int userId);
}
