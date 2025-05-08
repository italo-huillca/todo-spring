package com.huillca.todo.service;

import com.huillca.todo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        user.setId(nextId++);
        users.add(user);
    }
}