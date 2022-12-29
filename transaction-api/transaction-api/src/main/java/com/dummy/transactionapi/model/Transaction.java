package com.dummy.transactionapi.model;

import com.dummy.transactionapi.Enum.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private Integer id;

    private String transactionId;

    private Integer accountId;

    private TransactionType type;

    private LocalDateTime time;

    private double amount;
}
