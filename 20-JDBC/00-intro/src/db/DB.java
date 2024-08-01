package db;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    public static Connection getConnection() {

        if(connection == null) {
            try {

                Properties properties = loadProperties();
                String url = properties.getProperty("burl");
                connection = DriverManager.getConnection(url, properties);
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


