package com.dummy.transactionservice;

import com.dummy.transactionservice.model.User;

public class TestData {

    public static User getTestUser() {

        User user = new User();
        user.setId(1);
        user.setName("Jim");
        return user;
    }
}
