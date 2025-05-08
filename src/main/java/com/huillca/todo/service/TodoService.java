package com.huillca.todo.service;

import com.huillca.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    public List<Todo> getAllTodos() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
    }
}
