/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search.view;

import search.domain.Question;

/**
 *
 * @author Gustavo
 */
public abstract class QuestionView {
    
    protected Question question;

    public QuestionView(Question question) {
        this.question = question;
    }

    public QuestionView() {
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    
    
    
    public abstract String getView();
}
