package com.nikhil.io.nikhil.repository;

import com.nikhil.io.nikhil.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods if needed
}
