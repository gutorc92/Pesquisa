/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ConstructorDataBase {

    private String createDataBase;
    private String dropDataBase;
    private String tableForm;
    private String tableQuestion;
    private String tableOption;

    private ConstructorDataBase() {
    }

    
    public ConstructorDataBase(int typeDatabase) {
        Properties proparties = loadProperties(typeDatabase);
        loadSqls(proparties);
    }

    private void loadSqls(Properties properties) {
        createDataBase = properties.getProperty("createDataBase");
        dropDataBase = properties.getProperty(" dropDataBase");
        tableForm = properties.getProperty("tableForm");
        tableQuestion = properties.getProperty("tableQuestion");
        tableOption = properties.getProperty("tableOption");
    }

    private Properties loadProperties(int typeDatabase) {
        Properties prop = new Properties();
        String nameProperties = "src.resources.";

        switch (typeDatabase) {
            case MYSQL_DATABASE:
                nameProperties = PROPERTIES_MYSQL;
                break;
            default:
                nameProperties = PROPERTIES_MYSQL;
                break;
        }

        try {
            prop.load(new FileInputStream(nameProperties));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop;


    }
    
    public void execute(){
        System.out.println(createDataBase);
        System.out.println(dropDataBase);
        System.out.println(tableForm);
        System.out.println(tableOption);
        System.out.println(tableQuestion);
        System.out.println();
                
    }
    public static final int MYSQL_DATABASE = 1;
    private final String PROPERTIES_MYSQL = "mySqlDataBase.properties";
}
