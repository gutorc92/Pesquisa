/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import persistence.PForm;
import search.domain.Form;

/**
 *
 * @author Gustavo
 */
public class PFormTest {
    
    private PForm pform;
    
    public PFormTest() {
        
    }
    
    @Before
    public void instance(){
        try{
            pform = new PForm();
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
    
    @Test
    public void saveTest(){
        Form form = new Form();
        form.setTitle("Teste de inserção de forms");
        form.setDescription("Testando a inserção de dados no banco para verificar se esta tudo funcionando.");
        form.setQuatityMinimum(10);
        try{
            pform.save(form);
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }
}