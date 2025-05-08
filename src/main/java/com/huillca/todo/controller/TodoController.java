package com.huillca.todo.controller;

import com.huillca.todo.model.Todo;
import com.huillca.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    // Mostrar la lista de tareas
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "index";
    }

    // Mostrar formulario para agregar tarea
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "add-todo";
    }

    // Procesar el formulario para agregar tarea
    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todoService.addTodo(todo);
        return "redirect:/";
    }
}
