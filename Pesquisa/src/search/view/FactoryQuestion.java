/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search.view;

import search.domain.Question;
import search.domain.TypeQuestion;
import search.view.Paper.QuestionSinglePaper;

/**
 *
 * @author Gustavo
 */
public class FactoryQuestion {
    
    public static QuestionView createQuestionView(Question question, int typeForm){
        TypeQuestion type = question.getTypeQuestion();
        if(type.getDescription().equals("QuestionSingle")){
            return createQuestionSigleView(typeForm);
        }
        
        return null;
    }
    
    private static QuestionView createQuestionSigleView(int typeForm){
        switch(typeForm){
            case FormView.VIEW_PAPER:
                return new QuestionSinglePaper();
                
        }
        
        return null;
    }
    
    
}
