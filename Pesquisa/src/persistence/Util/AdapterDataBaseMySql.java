/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class AdapterDataBaseMySql implements AdapterDataBase{

    ConnectionDataBase connection = ConnectionDataBase.getInstance();
    Statement statement;
    @Override
    public void executeSql(String Sql) {
        try {
            statement.execute(Sql);
        } catch (SQLException ex) {
            Logger.getLogger(AdapterDataBaseMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void beginTransction() {
        try {
            statement =  connection.getCon().createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdapterDataBaseMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void commitTransction() {
        try {
           // connection.getCon().commit();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdapterDataBaseMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
