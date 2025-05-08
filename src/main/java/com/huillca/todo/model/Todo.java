package com.huillca.todo.model;

public class Todo {
    private Long id;
    private String title;
    private boolean completed;
    private User user; // Nuevo campo

    // Constructor vacío
    public Todo() {}

    // Constructor con parámetros
    public Todo(Long id, String title, boolean completed, User user) {
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.user = user;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
