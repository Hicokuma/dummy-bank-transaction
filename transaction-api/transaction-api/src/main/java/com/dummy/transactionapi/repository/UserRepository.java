package com.dummy.transactionapi.repository;

import com.dummy.transactionapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
