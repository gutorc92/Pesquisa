/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import persistence.Util.ConnectionDataBase;
import persistence.Util.TransactionDataBase;

/**
 *
 * @author Gustavo
 */
public class Persistence {
    
    ConnectionDataBase connection;
    
    TransactionDataBase transaction;
    
    protected String insert;
    
    protected String update;
    
    protected String delete;

    public Persistence() {
        connection = ConnectionDataBase.getInstance();
        transaction = new TransactionDataBase();
    }
    
    

    
    
    
    
}
