package com.dummy.transactionapi.service.serviceImpl;

import com.dummy.transactionapi.model.User;
import com.dummy.transactionapi.repository.UserRepository;
import com.dummy.transactionapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {

        return userRepository.findById(id); // Todo: .orElseThrow(() -> new ResourceNotFoundException(...))
    }

    @Override
    public User createUser(User userDetail) {

        return userRepository.save(userDetail);
    }

    @Override
    public User updateUserById(int id, User userDetails) {

        User user = this.getUserById(id).get();
        user.setName(userDetails.getName());
        return userRepository.save(user); // Todo: is it the right thing to return? should we return Optional?
    }

    @Override
    public void deleteUserById(int id) {

        userRepository.deleteById(id);
    }
}
