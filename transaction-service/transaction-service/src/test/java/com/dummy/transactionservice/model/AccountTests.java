package com.dummy.transactionservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTests {

    @Test
    void modelExists() {
        assertNotNull(new Account());
    }
}
