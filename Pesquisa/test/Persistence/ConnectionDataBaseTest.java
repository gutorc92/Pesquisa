/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistence.Util.ConnectionDataBase;

/**
 *
 * @author Gustavo
 */
public class ConnectionDataBaseTest {
    
    ConnectionDataBase connection;
    
    public ConnectionDataBaseTest() {
    
    }
    
    @Test
    public void testNewInstance(){
        try{
            connection = ConnectionDataBase.getInstance();
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
    
  
}