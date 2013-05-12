/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.Util;

/**
 *
 * @author Gustavo
 */
public class TransactionDataBase {
    
    private AdapterDataBase adapter = null;
    
    public void executeSql(String Sql){
        
        adapter.executeSql(Sql);
    }
    
    public void beginTransction(){
        adapter.beginTransction();
    }
    
    public void commitTransction(){
        adapter.commitTransction();
    }

    public AdapterDataBase getAdapter() {
        return adapter;
    }

    public void setAdapter(AdapterDataBase adapter) {
        this.adapter = adapter;
    }
    
    
    
}
