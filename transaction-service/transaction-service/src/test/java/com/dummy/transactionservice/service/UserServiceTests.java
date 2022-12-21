package com.dummy.transactionservice.service;

import com.dummy.transactionservice.repository.UserRepository;
import com.dummy.transactionservice.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.dummy.transactionservice.TestData.getTestUserList;
import static org.mockito.Mockito.doReturn;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTests {

    // TODO:
    //  1) fetch all users & fetch one user
    //  2) create users
    //  3) update users

    @InjectMocks
    UserServiceImpl userService;
    @Mock
    UserRepository userRepository;

    @Test
    void canFetchAllUser() {

        doReturn(getTestUserList()).when(userRepository).findAll();

        assertReflectionEquals(getTestUserList(), userService.getAllUsers());
    }
}
