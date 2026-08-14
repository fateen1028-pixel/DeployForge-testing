package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUser(Long id) {
        User user = repository.findById(id);
        return user.getName();
    }

    public String getUserName(Long id) {
        User user = repository.findById(id);
        return user.getName();
    }

    public String getUserEmail(Long id) {
        User user = repository.findById(id);
        return user.getEmail();
    }
}