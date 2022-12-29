package com.dummy.transactionapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTests {

    @Test
    void modelExists() {
        assertNotNull(new User());
    }
}
