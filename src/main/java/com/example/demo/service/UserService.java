package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUserName(Long id) {
        return repository.findById(id).getNonExistingName();
    }
}