package com.yusufaytin.auth.repository;

import com.yusufaytin.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
