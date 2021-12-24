package com.rmn.hw.service;

import java.util.Optional;

import com.rmn.hw.entity.User;

public interface IUserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);
}
