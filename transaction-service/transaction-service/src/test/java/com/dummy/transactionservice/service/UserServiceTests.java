package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.User;
import com.dummy.transactionservice.repository.UserRepository;
import com.dummy.transactionservice.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.dummy.transactionservice.TestData.getTestUser;
import static com.dummy.transactionservice.TestData.getTestUserDetails;
import static com.dummy.transactionservice.TestData.getTestUserList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doAnswer;
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

    @Test
    void canFetchOneUser() {

        doReturn(getTestUser()).when(userRepository).findById(anyInt());

        assertReflectionEquals(getTestUser().get(), userService.getUserById(1).get());
    }

    @Test
    void canUpdateOneUser() {

        doReturn(getTestUser()).when(userRepository).findById(anyInt());
        doAnswer(i -> i.getArguments()[0]).when(userRepository).save(any(User.class));

        assertEquals(getTestUserDetails().getName(), userService.updateUserById(1, getTestUserDetails()).getName());
    }
}
