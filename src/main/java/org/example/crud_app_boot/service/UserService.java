package org.example.crud_app_boot.service;

import org.example.crud_app_boot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    List<User> findAllUsers();

    User findUserById(Long id);

    void removeUser(User user);
}
