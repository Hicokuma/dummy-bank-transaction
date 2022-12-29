package com.dummy.transactionapi.service;

import com.dummy.transactionapi.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);

    List<Account> getAccountsByUserId(int userId);

    boolean deleteAccountByIdIfZeroBalance(int accountId);

    void updateAccountBalanceById(int id, double increment);
}
