package dev.orwin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        String url = System.getenv("POSTGRES_SQL_DB");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("PASSWORD");
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
