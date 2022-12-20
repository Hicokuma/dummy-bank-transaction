package com.dummy.transactionservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionTests {

    @Test
    public void modelExists() {
        assertNotNull(new Transaction());
    }
}
