package com.dummy.transactionservice.service.serviceImpl;

import com.dummy.transactionservice.model.Account;
import com.dummy.transactionservice.repository.AccountRepository;
import com.dummy.transactionservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {

        return accountRepository.save(account);
    }
}
