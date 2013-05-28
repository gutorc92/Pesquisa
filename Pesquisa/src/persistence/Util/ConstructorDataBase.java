/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
    private String tableTypeQuestion;
    private String insertTypeQuestion;
    private String useDataBase;
    
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
        tableTypeQuestion = properties.getProperty("tableTypeQuestion");
        insertTypeQuestion = properties.getProperty("insertTypeQuestion");
        useDataBase = properties.getProperty("useDataBase");
    }

    private Properties loadProperties() {
        Properties prop = new Properties();
        String nameProperties = "src\\resources\\";

        switch (ConnectionDataBase.getTypeDataBase()) {
            case ConnectionDataBase.MYSQL_DATABASE:
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
        trasaction.beginTransction();
        try {
            trasaction.executeSql(createDataBase);
            trasaction.executeSql(useDataBase);
            trasaction.executeSql(tableForm);
            trasaction.executeSql(tableQuestion);
            trasaction.executeSql(tableOption);
            trasaction.executeSql(tableTypeQuestion);
            insertDataBase(trasaction, insertTypeQuestion);
            trasaction.commitTransction();
            updatedDatabaseProperties();
            ConnectionDataBase.closeConnection();
            
           
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
        System.out.println(tableTypeQuestion);
        System.out.println();

    }
    
    public void updatedDatabaseProperties() throws IOException {
        Properties properties = new Properties();
        
        String fileProperties = "src\\persistence\\Util\\database.properties";
        
        properties.load(new FileInputStream(fileProperties));

        properties.setProperty("databaseCreated", "true");
        
        properties.save(new FileOutputStream(fileProperties),"");
        
        
    }
    
    private void insertDataBase(TransactionDataBase transaction, String sql){
        String inserts[] = sql.split(";");
        for(int i = 0; i < inserts.length; i++){
            transaction.executeSql(inserts[i]);
        }
    }
    
    private AdapterDataBase getAdapter(){
        switch(ConnectionDataBase.getTypeDataBase()){
            case ConnectionDataBase.MYSQL_DATABASE:
                return new AdapterDataBaseMySql();
                
        }
        return null;
    }
    
    private final String PROPERTIES_MYSQL = "mySqlDataBase.properties";
}
