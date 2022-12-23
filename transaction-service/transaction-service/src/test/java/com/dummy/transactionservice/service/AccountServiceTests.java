package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.Account;
import com.dummy.transactionservice.repository.AccountRepository;
import com.dummy.transactionservice.service.serviceImpl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.dummy.transactionservice.TestData.getTestAccount;
import static com.dummy.transactionservice.TestData.getTestAccountList;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTests {

    // TODO:
    //  1) create account
    //  2) list accounts for a user
    //  3) delete account (can only be deleted if balance = 0)

    @InjectMocks
    AccountServiceImpl accountService;

    @Mock
    AccountRepository accountRepository;

    @Test
    void canCreateOneAccount() {

        doAnswer(i -> i.getArguments()[0]).when(accountRepository).save(any(Account.class));

        assertReflectionEquals(getTestAccount(), accountService.createAccount(getTestAccount()));
        verify(accountRepository).save(getTestAccount());
    }

    @Test
    void canFetchAccountsByUserId() {

        doReturn(getTestAccountList()).when(accountRepository).findAllByUserId(anyInt());

        assertReflectionEquals(getTestAccountList(), accountService.getAccountsByUserId(1));
    }

    @Test
    void canDeleteAnAccount_ifBalanceIsZero() {

        Account account = getTestAccount();
        account.setBalance(0d);

        doReturn(Optional.of(account)).when(accountRepository).findById(anyInt());
        assertTrue(accountService.deleteAccountById(1));
    }

    @Test
    void cannotDeleteAnAccount_ifBalanceIsNotZero() {

        Account account = getTestAccount();
        account.setBalance(100d);

        doReturn(Optional.of(account)).when(accountRepository).findById(anyInt());
        assertFalse(accountService.deleteAccountById(1));
    }
}
