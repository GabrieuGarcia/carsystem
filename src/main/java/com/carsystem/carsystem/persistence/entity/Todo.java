package com.carsystem.carsystem.persistence.entity;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Todo {

    @Id
    private int id;
    private String message;
    private int priority;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}