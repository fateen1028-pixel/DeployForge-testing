package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUser(Long id) {
        return repository.findById(id);
    }

    public String getUserName(Long id) {
        return repository.findById(id).getNonExistingName();
    }

    public int getUserAge(Long id) {
        return repository.findById(id).getAge();
    }

    public MissingType brokenMethod() {
        return null;
    }
}