package com.dummy.transactionservice.repository;

import com.dummy.transactionservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findAllByUserId(Integer userId);
}
