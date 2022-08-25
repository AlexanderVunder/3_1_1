package com.example.springboot.service;

import com.example.springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    User findById(int id);

    void update(User updateUser);

    void delete(int id);
}
