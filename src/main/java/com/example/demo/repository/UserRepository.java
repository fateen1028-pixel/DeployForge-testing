package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(
                new User(
                        1L,
                        "Fateen",
                        "fateen@example.com",
                        true
                )
        );

        users.add(
                new User(
                        2L,
                        "Alex",
                        "alex@example.com",
                        true
                )
        );
    }

    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<User> findAll() {
        return users;
    }
}