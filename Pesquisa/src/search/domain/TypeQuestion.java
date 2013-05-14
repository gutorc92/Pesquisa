/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search.domain;

/**
 *
 * @author Gustavo
 */
public class TypeQuestion {
    
    private long id;
    
    private String description;

    public TypeQuestion(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
