/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.Util.TransactionDataBase;
import search.domain.Form;

/**
 *
 * @author Gustavo
 */
public class PForm extends Persistence implements IPersistence<Form>{

    public PForm() {
        super();
        loadSqls();
    }

    
    @Override
    public void save(Form entity) throws ExceptionDataBase {
        insert += "'" + entity.getTitle() + "'" + "'" + entity.getDescription() + "', " + entity.getQuatityMinimum()  + " );"; 
        
        try{
            transaction.beginTransction();
            transaction.executeSql(insert);
            transaction.commitTransction();
        }catch(Exception e){
            Logger log = Logger.getLogger("Excecoes");
            log.log(Level.FINE, e.toString());
            throw new ExceptionDataBase("Problem in database. ");
        }
    }

   

    @Override
    public void loadSqls() {
        insert = "INSERT INTO form(title,description,quantityMinimum) VALUES (";
        update = "UPDATE form SET ";
        delete = "DELETE FROM form WHERE idForm = ";
        
    }

    @Override
    public void save(Form entity, TransactionDataBase transaction) throws ExceptionDataBase {
        insert += "'" + entity.getTitle() + "'" + "'" + entity.getDescription() + "', " + entity.getQuatityMinimum()  + " );"; 
        
        try{
            transaction.executeSql(insert);
        }catch(Exception e){
            Logger log = Logger.getLogger("Excecoes");
            log.log(Level.FINE, e.toString());
            throw new ExceptionDataBase("Problem in database. ");
        }
    }

    @Override
    public void update(Form entityNew, Form entityOld) throws ExceptionDataBase {
        if(entityNew.equals(entityOld)){
            return ;
        }else{
            if(entityNew.getId() != entityOld.getId()){
                return ;
            }else{
                if(!entityNew.getDescription().equals(entityOld.getDescription()) ){
                    update += " descriptionForm = '" + entityNew.getDescription() + "'";
                }
                if(!entityNew.getTitle().equals(entityOld.getTitle()) ){
                    update += " titleForm = '" + entityNew.getDescription() + "'";
                }
                if(entityNew.getQuatityMinimum() !=  entityOld.getQuatityMinimum()){
                    update +=  " quantityMinimum = " + entityNew.getQuatityMinimum(); 
                }
            }
        }
    }

    @Override
    public void delete(Form entity) throws ExceptionDataBase {
        delete += entity.getId();
        transaction.executeSql(delete);
        
    }

    @Override
    public void save(List<Form> entitys) throws ExceptionDataBase {
        if(entitys == null)  throw new NullPointerException();
        transaction = new TransactionDataBase();
        transaction.beginTransction();
        for(int i = 0; i < entitys.size(); i++){
            save(entitys.get(i),transaction);
        }
        transaction.commitTransction();
        
    }

    @Override
    public List<Form> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Form findById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
