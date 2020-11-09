package com.letsmeet.LetsMeet.controller;

import java.util.HashMap;
import java.util.List;
import com.letsmeet.LetsMeet.bean.User;
import com.letsmeet.LetsMeet.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public Map<String, Object> postSample(@RequestBody User user) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", userService.registerUser(user));
        return response;
    }
}
