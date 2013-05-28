/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search.domain;

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
    
    private int quatityMinimum;
    
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

    public Form() {
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Form)){
            return false;
        }
        
        Form form = (Form)obj;
        if(form.getId() == id && form.getDescription() == description && form.getTitle() == title && form.getQuatityMinimum() == quatityMinimum
                && form.getQuestions().equals(questions)){
            return true;
        }
        
        return false;
        
    }

    public int getQuatityMinimum() {
        return quatityMinimum;
    }

    public void setQuatityMinimum(int quatityMinimum) {
        this.quatityMinimum = quatityMinimum;
    }
    
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Form newForm = new Form();
        newForm.setId(id);
        newForm.setDescription(description);
        newForm.setTitle(title);
        newForm.setQuestions(questions);
        newForm.setQuatityMinimum(quatityMinimum);
        return newForm;
    }
    
    
    
    
    
    
    
}
