package com.carsystem.carsystem.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;

@Scope(value = "session")
@ManagedBean(value = "carManageBean")
public class CarManageBean {

    @Autowired
    public String loadTodoPage() {
        return "/index.xhtml";
    }

    private void checkPermission() {
        // Details omitted
    }
}