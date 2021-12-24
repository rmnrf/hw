package com.rmn.hw.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rmn.hw.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
