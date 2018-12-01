package com.carsystem.carsystem.business;

import com.carsystem.carsystem.persistence.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import javax.annotation.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@Scope(value = "session")
@ManagedBean(value = "carManageBean")
public class CarManageBean {

    private Car car;
    private List<Car> cars= new ArrayList<>();

    /**
     * Method responsable to add car on the list
     */
    @Autowired
    public void add(){
        cars.add(car);
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Autowired
    public String loadTodoPage() {
        return "/index.xhtml";
    }

}