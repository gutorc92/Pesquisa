/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

/**
 *
 * @author Gustavo
 */
public class FactoryAdapter {
    
    
    public static AdapterDataBase getAdpater(){
        if(ConnectionDataBase.getTypeDataBase() == -1){
            ConnectionDataBase.getInstance();
        }
        switch(ConnectionDataBase.getTypeDataBase()){
            case ConnectionDataBase.MYSQL_DATABASE:
                return new AdapterDataBaseMySql();
        }
        return null;
    }
    
}
