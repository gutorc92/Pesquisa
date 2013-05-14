/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

/**
 *
 * @author Gustavo
 */
public class ExceptionDataBase extends Exception{

    public ExceptionDataBase() {
    }

    public ExceptionDataBase(String message) {
        super(message);
    }

    public ExceptionDataBase(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDataBase(Throwable cause) {
        super(cause);
    }
    
    
}
