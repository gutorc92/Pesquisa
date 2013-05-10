/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa.view.Paper;

import pesquisa.domain.Option;
import pesquisa.domain.Question;
import pesquisa.view.QuestionSigleView;

/**
 *
 * @author Gustavo
 */
public class QuestionSinglePaper extends QuestionSigleView{

    
    private int numberQuestion = -1;
    
    public QuestionSinglePaper() {
    
    }

    public QuestionSinglePaper(Question question) {
        super(question);
    }

    public QuestionSinglePaper(Question question, int numberQuestion) {
        super(question);
        this.numberQuestion = numberQuestion;
    }
    
    
    public String getPaper(){
        String text = " ";
        if(numberQuestion != -1){
            text = numberQuestion + " ";
        }
        text += question.getTextQuestion();
        for(int i = 0; i < question.getOptions().size(); i++){
            text += getPaperOpition(question.getOptions().get(i), i+1);
        }
        
        return text;
    }
    
    private String getPaperOpition(Option option, int numberOption){
        String text = "";
        if(numberOption < 0){
            text = numberOption + ". ";
        }
        text += "(  ) " + option.getTextOption();
        
        return text;
        
    }

    @Override
    public String getView() {
        return getPaper();
    }
    
    
    
    
    
}
