package com.example.app.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
private static final String URL = "jdbc:h2:~/ai_resume_ats;MODE=MySQL;DB_CLOSE_DELAY=-1";
private static final String USER = "sa";
private static final String PASS = "";


static {
try {
// H2 driver auto-registered; no explicit Class.forName needed for modern drivers.
} catch (Exception e) {
e.printStackTrace();
}
}


public static Connection getConnection() throws SQLException {
return DriverManager.getConnection(URL, USER, PASS);
}
}
