package com.example.demo.service;



import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUser(Long id) {
        return repository.findById(id);
    }

    public String getUserName(Long id) {
        User user = repository.findById(id);
        return user.getName();
    }

    public String getUserEmail(Long id) {
        User user = repository.findById(id);
        return user.getEmail();
    }

    public boolean isUserActive(Long id) {
        User user = repository.findById(id);
        return user.isActive();
    }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public String getUserDisplayName(Long id) {
        User user = repository.findById(id);
        return user.getName();
    }
}