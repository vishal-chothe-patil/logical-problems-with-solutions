package com.codingchallenges.solution.exceptions.basicexception;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // This will throw a SQLException if the URL or query is incorrect
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM nonexistenttable");
        } catch (SQLException e) {
            // Handle SQLException with a custom message
            System.out.println("Error occurred while interacting with the database.");
            System.out.println("SQLException Message: " + e.getMessage());
        }
    }
}
