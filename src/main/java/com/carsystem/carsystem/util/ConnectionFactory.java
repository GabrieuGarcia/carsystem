package com.carsystem.carsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;
    private static final String URL_CONNECTION = "jdbc:h2:~/test";
    private static final String USER = "sa";
    private static final String PASS = "";

    public static Connection getConnection() {
        if(connection == null){
            try {
                Class.forName("org.h2.Driver");
                connection = DriverManager.getConnection (URL_CONNECTION, USER,PASS);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if(connection != null){
            connection.close();
            connection = null;
        }
    }
}
