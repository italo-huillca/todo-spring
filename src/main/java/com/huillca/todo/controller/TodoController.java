package com.huillca.todo.controller;

import com.huillca.todo.model.Todo;
import com.huillca.todo.model.User;
import com.huillca.todo.service.TodoService;
import com.huillca.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        model.addAttribute("users", userService.getAllUsers());
        return "add-todo";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo, @RequestParam("user.id") Long userId) {
        User user = userService.getUserById(userId);
        todo.setUser(user);
        todoService.addTodo(todo);
        return "redirect:/";
    }
}
