package com.demo.security.controller;

import com.demo.security.model.User;
import com.demo.security.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 *  Controller for handling admin requests.
 *  List all users
 */
public class AdminController {

    private final UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * Returns a list of all users.
     * @return a list of all users
     */
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
