/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa.domain;

import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Form {
    
    private long id;
    
    private String title;
    
    private String description;

    private List<Question> questions;
    
    public Form(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Form(long id, String title, String description, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
    
    
    
    
    
}
