package com.deca.example.service.impl;

import com.deca.example.model.User;
import com.deca.example.repository.FruitRepository;
import com.deca.example.repository.UserRepository;
import com.deca.example.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final FruitRepository fruitRepository;

    @Override
    public User findUserByUUID(String userUuid) {
        log.info("findUserByUUID: Find User in DB with uuid: " + userUuid);
        return userRepository.findByUuid(userUuid);
    }

    @Override
    public User findUserByUsername(String username) {
        log.info("findUserByUsername: Find User in DB with username: " + username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        log.info("findAllUsers: Find all Users in DB");
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        log.info("saveUser: Save " + user + " in DB.");
        return userRepository.save(user);
    }
}
