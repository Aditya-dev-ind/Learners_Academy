package main.java.com.academy.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Database implements AutoCloseable {

    private static Connection connection = null;

  
    public static Connection getConnection() {

        try {

            Properties prop = new Database().getProperties();

            final String driver = prop.getProperty("db.driver");

            final String url = prop.getProperty("db.url");

            final String username = prop.getProperty("db.user");

            final String pass = prop.getProperty("db.password");

            Class.forName(driver);

            connection = DriverManager.getConnection(url, username, pass);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return connection;
    }

   
    public Properties getProperties() throws IOException {

        Properties prop = new Properties();
        prop.load(this.getClass().getClassLoader()
                .getResourceAsStream("/config.properties"));

        return prop;
    }

   
    @Override
    public void close() throws Exception {

        if (connection != null)
            connection.close();
    }
}
