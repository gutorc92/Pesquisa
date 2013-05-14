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
import persistence.Util.FactoryAdapter;

/**
 *
 * @author Gustavo
 */
public class FactoryAdapterDataBaseTeste {
    
    public FactoryAdapterDataBaseTeste() {
        
    }
    
    @Test
    public void testReturn(){
        ConnectionDataBase connection =  ConnectionDataBase.getInstance();
        assertNotNull(FactoryAdapter.getAdpater());
    }
    
    
}