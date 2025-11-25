// src/main/java/com/example/app/util/DBConnection.java
package com.example.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class dbconnection {
    private static final Properties props = new Properties();

    static {
        try (InputStream in = Connection.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (in == null) throw new RuntimeException("db.properties not found on classpath");
            props.load(in);
            Class.forName(props.getProperty("jdbc.driver"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError("Failed to load DB properties: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = props.getProperty("jdbc.url");
        String user = props.getProperty("jdbc.username");
        String pass = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, user, pass);
    }
}
