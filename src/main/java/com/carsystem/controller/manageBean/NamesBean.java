package com.carsystem.controller.manageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class NamesBean {

    private String name;
    private String surname;
    private String message;

    public void dizerOla(){
        message = "Olá " + name + surname;
    }

    public String getName() {

        if (name == null){
            name = new NamesBean().name;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
