package com.carsystem.carsystem.persistence.repository;

import com.carsystem.carsystem.persistence.entity.Car;
import com.carsystem.carsystem.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarRepository {

    public void save(Car car) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();

        PreparedStatement preparedStatement = connection.prepareCall(
                "INSET INTO CAR VALUES (?,?,?,?)");

        preparedStatement.setString(1, car.getBrand());
        preparedStatement.setString(2, car.getColor());
        preparedStatement.setString(3, car.getModelName());
        preparedStatement.setDate(4, new Date(car.getYear()));
        preparedStatement.execute();
        ConnectionFactory.closeConnection();
    }

}
