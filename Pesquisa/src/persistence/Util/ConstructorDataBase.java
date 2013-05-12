/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

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
    private int typeDatabase;

    private ConstructorDataBase() {
    }

    public ConstructorDataBase(int typeDatabase) {
        this.typeDatabase = typeDatabase;
        Properties proparties = loadProperties();
        loadSqls(proparties);
    }

    private void loadSqls(Properties properties) {
        createDataBase = properties.getProperty("createDataBase");
        dropDataBase = properties.getProperty(" dropDataBase");
        tableForm = properties.getProperty("tableForm");
        tableQuestion = properties.getProperty("tableQuestion");
        tableOption = properties.getProperty("tableOption");
    }

    private Properties loadProperties() {
        Properties prop = new Properties();
        String nameProperties = "src\\resources\\";

        switch (typeDatabase) {
            case MYSQL_DATABASE:
                nameProperties += PROPERTIES_MYSQL;
                break;
            default:
                nameProperties += PROPERTIES_MYSQL;
                break;
        }

        try {
            prop.load(new FileInputStream(nameProperties));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop;


    }

    public void execute() throws Exception {
        TransactionDataBase trasaction = new TransactionDataBase();
        AdapterDataBase adapter = getAdapter();
        trasaction.setAdapter(adapter);
        trasaction.beginTransction();
        try {
            //trasaction.executeSql(dropDataBase);
            trasaction.executeSql(createDataBase);
            trasaction.executeSql("USE formularios");
            trasaction.executeSql(tableForm);
            trasaction.executeSql(tableQuestion);
            trasaction.executeSql(tableOption);
            trasaction.commitTransction();
            ConnectionDataBase.setDatabaseCreated(true);
            
           
        } catch (Exception e) {
            e.printStackTrace();
            trasaction.executeSql(dropDataBase);
            throw new Exception("Don`t create database");
        }
        System.out.println(createDataBase);
        System.out.println(dropDataBase);
        System.out.println(tableForm);
        System.out.println(tableOption);
        System.out.println(tableQuestion);
        System.out.println();

    }
    
    private AdapterDataBase getAdapter(){
        switch(typeDatabase){
            case MYSQL_DATABASE:
                return new AdapterDataBaseMySql();
                
        }
        return null;
    }
    public static final int MYSQL_DATABASE = 1;
    private final String PROPERTIES_MYSQL = "mySqlDataBase.properties";
}
