package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection () {

    }

    public static Connection getInstance() throws SQLException, ClassNotFoundException {
        if(connection == null) {
            String url = "jdbc:mysql://localhost:3306/database";
            String username = "root";
            String password = "Analfabet!32";
            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
