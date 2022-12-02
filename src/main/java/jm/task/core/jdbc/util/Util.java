package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/userssql";
    private static final String USERNAME = "Nurkhayat";
    private static final String PASSWORD = "root";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
        }

}
