package com.dummy.transactionservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTests {

    @Test
    public void modelExists() {
        assertNotNull(new User());
    }
}
