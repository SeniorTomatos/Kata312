package com.kataacademy.kata312.service;


import com.kataacademy.kata312.model.User;
import com.kataacademy.kata312.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository repository;

    @Override
    @Transactional
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {

        return repository.findById(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        repository.save(user);
    }
}
