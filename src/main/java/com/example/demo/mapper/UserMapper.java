package com.example.demo.mapper;

import com.example.demo.dto.UserSummary;
import com.example.demo.model.User;

public class UserMapper {

    public UserSummary toSummary(User user) {

        return new UserSummary(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}