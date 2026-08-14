package com.example.demo.repository;

import com.example.demo.model.User;

public class UserRepository {

    public User findById(Long id) {
        return new User(id, "Fateen");
    }
}