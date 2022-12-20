package com.dummy.transactionservice.repository;

import com.dummy.transactionservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
