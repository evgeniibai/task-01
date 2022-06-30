package com.deca.example.service;

import com.deca.example.model.User;

import java.util.List;

public interface UserService {
    User findUserByUUID(String userUuid);

    User findUserByUsername(String username);

    List<User> findAllUsers();

    User saveUser(User user);

    //User updateUser(String userUuid);
}
