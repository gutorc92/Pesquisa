/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public interface IBusiness<T> {
    
    public List<T> getAll();
    
    public T getFindById(long id);
    
    public void save(T entity);
    
        
    
    
    
    
}
