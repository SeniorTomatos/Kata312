package com.kataacademy.kata312.service;

import com.kataacademy.kata312.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(long id);

    void deleteUser(long id);

}
