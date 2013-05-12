/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static persistence.Util.ConstructorDataBase.MYSQL_DATABASE;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gustavo
 */
public class ConnectionDataBase {

    private static ConnectionDataBase connection;
    private Connection con = null;
    private String user;
    private String password;
    private String driver;
    private String server;
    private String database;
    private static boolean databaseCreated = false;

    private void connect() {
        Properties properties = loadProperties();
        load(properties);
        try {
            Class.forName(driver).newInstance();
            if(databaseCreated){
                con = DriverManager.getConnection(server+database, user, password);
            }else{
                con = DriverManager.getConnection(server, user, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void setDatabaseCreated(boolean databaseCreated) {
        ConnectionDataBase.databaseCreated = databaseCreated;
    }
    
    

    private void load(Properties properties) {
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        driver = properties.getProperty("driver");
        server = properties.getProperty("server");
        database = properties.getProperty("database");
    }

    private Properties loadProperties() {
        Properties prop = new Properties();
        String nameProperties = "src\\persistence\\Util\\database.properties";

        try {
            prop.load(new FileInputStream(nameProperties));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop;


    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    

    private ConnectionDataBase() {
        
    }
    
    public static ConnectionDataBase getInstance(){
        if(connection == null){
            connection = new ConnectionDataBase();
            connection.connect();
            
        }
        return connection;
        
    }
}
