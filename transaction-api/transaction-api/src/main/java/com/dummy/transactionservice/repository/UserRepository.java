package com.dummy.transactionservice.repository;

import com.dummy.transactionservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
