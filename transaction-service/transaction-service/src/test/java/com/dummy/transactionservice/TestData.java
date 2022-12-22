package com.dummy.transactionservice;

import com.dummy.transactionservice.model.User;
import net.bytebuddy.dynamic.DynamicType;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestData {

    public static Optional<User> getTestUser() {

        User user = new User();
        user.setId(1);
        user.setName("Jim");
        return Optional.of(user);
    }

    public static User getTestUserDetails() {

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
}
