// src/main/java/com/nikhil/io/nikhil/service/UserService.java

package com.nikhil.io.nikhil.service;

import com.nikhil.io.nikhil.model.User;
import com.nikhil.io.nikhil.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long userId, User newUser) {
        if (userRepository.existsById(userId)) {
            newUser.setUserId(userId);
            return userRepository.save(newUser);
        }
        return null; // Handle user not found
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
