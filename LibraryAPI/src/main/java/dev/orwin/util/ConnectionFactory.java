package dev.orwin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(System.getenv("POSTGRES_SQL_DB"));
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
