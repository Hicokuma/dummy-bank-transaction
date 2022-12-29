package com.dummy.transactionapi;

import com.dummy.transactionapi.model.Account;
import com.dummy.transactionapi.model.User;

import java.util.Arrays;
import java.util.List;

public class TestData {

    public static User getTestUser() {

        User user = new User();
        user.setId(1);
        user.setName("Jimmy");

        return user;
    }

    public static List<User> getTestUserList() {

        return Arrays.asList(getTestUser());
    }

    public static Account getTestAccount() {

        Account account = new Account();

        account.setId(10);
        account.setOwnerId(1);
        account.setBalance(100d);
        account.setCurrency("GBP");

        return account;
    }

    public static List<Account> getTestAccountList() {

        return Arrays.asList(getTestAccount());
    }
}
