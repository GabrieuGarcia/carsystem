package com.carsystem.business.service;

import com.carsystem.persistence.entity.Todo;
import com.carsystem.persistence.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Scope(value = "session")
@Component (value = "todoService")
public class TodoService {

    @Autowired
    private CrudRepository<Todo> todoRepository;
    private Todo todo = new Todo();

    public void save() {
        todoRepository.save(todo);
        todo = new Todo();
    }

    public Collection<Todo> getAllTodo() {
        return todoRepository.getAll();
    }

    public int saveTodo(Todo todo) {
        validate(todo);
        return todoRepository.save(todo);
    }

    private void validate(Todo todo) {
        // Details omitted
    }

    public Todo getTodo() {
        return todo;
    }
}