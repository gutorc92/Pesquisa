/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistence.Util.ConnectionDataBase;
import persistence.Util.ConstructorDataBase;

/**
 *
 * @author Gustavo
 */
public class ConstructorDataBaseTest {
    
    private ConstructorDataBase constructor;
    
    public ConstructorDataBaseTest() {
        
        
    }
    
    @Test
    public void testExecute(){
        constructor = new ConstructorDataBase(ConnectionDataBase.MYSQL_DATABASE);
        try{
            constructor.execute();
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
}