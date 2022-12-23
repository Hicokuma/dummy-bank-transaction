package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    Optional<User> getUserById(Integer id);

    User updateUserById(Integer id, User userDetail);

    User createUser(User userDetail);

    void deleteUserById(Integer id);
}
