package com.dummy.transactionservice.service.serviceImpl;

import com.dummy.transactionservice.model.User;
import com.dummy.transactionservice.repository.UserRepository;
import com.dummy.transactionservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }
}
