package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUser(Long id) {
        return repository.findUser(id);
    }

    public String getUserName(Long id) {
        User user = repository.findById(id);
        return user.getUserName();
    }

    public String getUserEmail(Long id) {
        User user = repository.findById(id);
        return user.getEmailAddress();
    }

    public boolean isUserActive(Long id) {
        User user = repository.findById(id);
        return user.getEnabled();
    }

    public List<User> getUsers() {
        return repository.findUsers();
    }

    public String getUserDisplayName(Long id) {
        User user = repository.findById(id);

        return user.getFirstName()
                + " "
                + user.getLastName();
    }
}