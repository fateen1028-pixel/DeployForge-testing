package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return service.findUser(id);
    }

    @GetMapping("/{id}/name")
    public String getName(@PathVariable Long id) {
        return service.getUserFullName(id);
    }

    @GetMapping("/{id}/email")
    public String getEmail(@PathVariable Long id) {
        return service.getEmail(id);
    }

    @GetMapping("/{id}/active")
    public boolean isActive(@PathVariable Long id) {
        return service.isActive(id);
    }

    @GetMapping
    public List<User> getUsers() {
        return service.findAllUsers();
    }

    @GetMapping("/{id}/display")
    public String getDisplayName(@PathVariable Long id) {
        return service.getDisplayName(id);
    }
}