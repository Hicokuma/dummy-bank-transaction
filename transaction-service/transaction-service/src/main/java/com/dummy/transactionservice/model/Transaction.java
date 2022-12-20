package com.dummy.transactionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private Integer id;

    private Integer senderId;

    private Integer recipientId;

    private LocalDateTime time;

    private double amount;
}
