package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(int id);

    User updateUserById(int id, User userDetail);

    User createUser(User userDetail);

    void deleteUserById(int id);
}
