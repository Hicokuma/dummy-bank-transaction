package com.dummy.transactionapi.repository;

import com.dummy.transactionapi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findAllByUserId(Integer userId);
}
