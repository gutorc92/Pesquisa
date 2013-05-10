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
public class Question {
    
    private long id;
    
    private String textQuestion;
    
    private List<Option> options;
    
    private TypeQuestion typeQuestion;
    

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Question(long id, String textQuestion, List<Option> options, TypeQuestion typeQuestion) {
        this.id = id;
        this.textQuestion = textQuestion;
        this.options = options;
        this.typeQuestion = typeQuestion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }
    
    
    
    
}
