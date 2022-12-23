package com.dummy.transactionservice;

import com.dummy.transactionservice.model.Account;
import com.dummy.transactionservice.model.User;

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

        User user = new User();
        user.setId(1);
        user.setName("Jim");

        return Arrays.asList(user);
    }

    public static Account getTestAccount() {

        Account account = new Account();

        account.setId(10);
        account.setOwnerId(1);
        account.setBalance(100d);
        account.setCurrency("GBP");

        return account;
    }
}
