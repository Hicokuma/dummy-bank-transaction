package com.dummy.transactionservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTests {

    @Test
    public void userModelExists() {
        assertNotNull(new User());
    }
}
