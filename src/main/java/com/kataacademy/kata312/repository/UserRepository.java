package com.kataacademy.kata312.repository;

import com.kataacademy.kata312.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
