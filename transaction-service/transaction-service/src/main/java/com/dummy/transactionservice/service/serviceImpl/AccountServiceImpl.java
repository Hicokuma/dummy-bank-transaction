package com.dummy.transactionservice.service.serviceImpl;

import com.dummy.transactionservice.model.Account;
import com.dummy.transactionservice.repository.AccountRepository;
import com.dummy.transactionservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {

        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccountsByUserId(int userId) {

        return accountRepository.findAllByUserId(userId);
    }

    @Override
    public boolean deleteAccountById(Integer accountId) {

        Optional<Account> accountOptional = accountRepository.findById(accountId);
        if(accountOptional.isPresent()) {

            if(accountOptional.get().getBalance() == 0) {
                accountRepository.deleteById(accountId);
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateAccountBalanceById(int id, double increment) {

        Account account = accountRepository.findById(id).get();
        account.setBalance(account.getBalance() + increment);

        accountRepository.save(account);
    }
}
