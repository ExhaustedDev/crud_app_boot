package org.example.crud_app_boot.dao;

import org.example.crud_app_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
