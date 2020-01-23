package com.practice.userManagementSystem.service;

import com.practice.userManagementSystem.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void addUser(User user);

    User updateUser(User user);

    User deleteUser(int id);
}
