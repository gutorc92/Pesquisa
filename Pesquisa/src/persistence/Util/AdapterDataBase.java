/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

/**
 *
 * @author Gustavo
 */
public interface AdapterDataBase {
    
    public void executeSql(String Sql);
    
    public void beginTransction();
    
    public void commitTransction();
    
}
