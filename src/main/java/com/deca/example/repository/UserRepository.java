package com.deca.example.repository;

import com.deca.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUuid(String userUuid);

    User findByUsername(String username);
}
