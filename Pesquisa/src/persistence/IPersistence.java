/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import persistence.Util.TransactionDataBase;

/**
 *
 * @author Gustavo
 */
public interface IPersistence<T> {
    
    public void save(T entity) throws ExceptionDataBase;
    
    public void save(T entity, TransactionDataBase transaction) throws ExceptionDataBase;
    
    public void update(T entityNew, T entityOld) throws ExceptionDataBase;
    
    public void delete(T entity) throws ExceptionDataBase;
    
    public void save(List<T> entitys) throws ExceptionDataBase;
    
    public List<T> getAll();
    
    public T findById(long id);
    
    public void loadSqls();
    
    
}
