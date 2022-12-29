package com.dummy.transactionapi.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TransactionTests {

    @Test
    void modelExists() {
        assertNotNull(new Transaction());
    }
}
