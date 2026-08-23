package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserReportService {

    private final UserRepository repository;

    public UserReportService(UserRepository repository) {
        this.repository = repository;
    }

    public long countActiveUsers() {

        return repository.findAll()
                .stream()
                .filter(User::isActive)
                .count();
    }

    public String buildReport(Long id) {

        User user = repository.findById(id);

        return "User: "
                + user.getName()
                + ", email=" + user.getEmail()
                + ", active=" + user.isActive();
    }
}