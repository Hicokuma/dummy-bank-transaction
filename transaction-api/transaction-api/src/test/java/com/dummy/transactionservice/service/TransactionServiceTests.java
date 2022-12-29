package com.dummy.transactionservice.service;

public class TransactionServiceTests {

    // TODO:
    //  1) Create transactions (2 types: credit/debit)
    //          Option A: each record has 1 distinguished transaction ID and links to two account IDs (sender/recipient)
    //          Option B: each record has 1 ID, 1 type (credit/debit) and links to 1 account. Multiple records share the same transaction ID.
    //     This project will go with option B, referring to the reason in https://stackoverflow.com/questions/4415022/database-design-accounting-transaction-table.
    //  2) For simplicity, the transactions should be between users of the microservice. If the user is unknown, the transaction should be rejected
    //  3) Search for user transactions. Filters: all accounts / specific accounts, between dates (start/end), between amounts (min/max)
    //  4) If one or more action involved in a transaction fails, all other actions must back out leaving the state of the application unchanged.
}
