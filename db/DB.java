package db;

import java.sql.*;

public class DB {
    // Encapsulation - only db can access conn
    private static Connection conn;

    // Initialize database connection
    public static void Connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            // TODO: Pull name from .env AZIM: Why??
            conn = DriverManager.getConnection("jdbc:sqlite:db/test.db");
            // Output test
            System.out.println("Success: Opened database.");
            
            // Creates tables if they do not exist
            // Inserts sample test data on first init

        // Handle error
        } catch ( ClassNotFoundException e ) {
            throw new SQLException("Error: SQLite JBDC driver not found", e);
        }
    }

    // Getter for DAOs
    public static Connection getConnection() throws SQLException {
        // Handle error
        if (conn.isClosed()) {
            throw new SQLException("Error: JDBC connection is closed!");
        }
        // Return live connection object to execute SQL queries
        return conn; 
    }
}