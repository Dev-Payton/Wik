package com.devpayton.wik.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:wik.db";
    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void initializeDatabase() {
        String sqlCreateUsers = "CREATE TABLE IF NOT EXISTS users (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "username TEXT NOT NULL UNIQUE, " +
                "password TEXT NOT NULL)";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sqlCreateUsers);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
