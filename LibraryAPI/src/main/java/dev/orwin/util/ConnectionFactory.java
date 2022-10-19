package dev.orwin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

        //For compatibility with other technologies, w need to register our PostgreSQL Driver
        //This process makes the application aware of what database Driver (SQL dialect) we're using
        try {
            Class.forName("org.postgresql.Driver");//try to find and return PostgreSQL Driver class
        }
        catch (ClassNotFoundException e) {
            System.out.println("CLASS WASN'T FOUND");
            e.printStackTrace();//this will print the exception message to the console
        }

        //we need to provide our database credentials
        //well hard code them for now, but ill show a way to hide the credentials in environment variables

        //the url to my database schema
        // THE ONLY THINGS YOU MIGHT have to change is the PORT and the schema (maybe database if yours isnt called postgres for some reason)
        String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=practice";
        //                                         ^ port  ^database               ^ schema
        // Something to keep in mind in regards to your postgres database and schema, DONT USE SPACES OR Slashes or UNDERSCORES or Capitals
        //Your Postgres user name
        String username = "postgres";
        //your Postgres password
        String password = "password";

        //this is what actually returns our Connection Object (note how this method has a return type of connection)
        return DriverManager.getConnection(url, username, password);

    }

}
