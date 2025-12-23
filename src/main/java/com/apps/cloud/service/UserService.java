package com.apps.cloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apps.cloud.User;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
            new User(1L, "Eswar"),
            new User(2L, "Kumar")
        );
    }
}
