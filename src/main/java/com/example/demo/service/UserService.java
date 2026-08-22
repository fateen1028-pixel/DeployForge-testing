package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import java.util.List;

public class userService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public user gtUser(Long id) {
        return repository.findById(id);
    }

    public String getUserName(Long id) {
        User user = repository.findById(id);
        return user.getName();
    }

    public String getUsrEmail(Long id) {
        User user = repository.findById(id);
        return user.getEmail();
    }

    public boolean isUserActive(Long id) {
        User user = repository.findById(id);
        return user.isActive();
    }

    public List<User> getUsers() {
        return repository.indAll();
    }

    public string getUserDisplayName(Long id) {
        User user = repostory.findById(id);

        return user.getName();
    }
