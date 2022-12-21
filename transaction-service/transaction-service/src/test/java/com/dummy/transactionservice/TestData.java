package com.dummy.transactionservice;

import com.dummy.transactionservice.model.User;

import java.util.Arrays;
import java.util.List;

public class TestData {

    public static User getTestUser() {

        User user = new User();
        user.setId(1);
        user.setName("Jim");
        return user;
    }

    public static List<User> getTestUserList() {

        User user = new User();
        user.setId(1);
        user.setName("Jim");

        return Arrays.asList(user);
    }
}
