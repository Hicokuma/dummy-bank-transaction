package com.dummy.transactionservice.service;

import com.dummy.transactionservice.model.User;
import com.dummy.transactionservice.repository.UserRepository;
import com.dummy.transactionservice.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static com.dummy.transactionservice.TestData.getTestUser;
import static com.dummy.transactionservice.TestData.getTestUserList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;
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

        doReturn(Optional.of(getTestUser())).when(userRepository).findById(anyInt());

        assertReflectionEquals(getTestUser(), userService.getUserById(1).get());
    }

    @Test
    void canCreateOneUser(){

        doAnswer(i -> i.getArguments()[0]).when(userRepository).save(any(User.class));

        assertReflectionEquals(getTestUser(), userService.createUser(getTestUser()));
        verify(userRepository).save(getTestUser());
    }

    @Test
    void canUpdateOneUser() {

        doReturn(Optional.of(getTestUser())).when(userRepository).findById(anyInt());
        doAnswer(i -> i.getArguments()[0]).when(userRepository).save(any(User.class));

        User userUpdated = getTestUser();
        userUpdated.setName("Jimmy");

        assertEquals(getTestUser().getName(), userService.updateUserById(1, userUpdated).getName()); // check returned value
        verify(userRepository).save(getTestUser()); // check that the right entity is saved
    }

    @Test
    void canDeleteOneUser() {

        userService.deleteUserById(1);
        verify(userRepository).deleteById(1);
    }
}
