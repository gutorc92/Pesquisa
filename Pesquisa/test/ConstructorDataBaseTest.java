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
import persistence.ConstructorDataBase;

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
        constructor = new ConstructorDataBase(ConstructorDataBase.MYSQL_DATABASE);
        constructor.execute();
    }
}