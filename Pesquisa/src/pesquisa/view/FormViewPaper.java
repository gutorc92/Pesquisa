/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa.view;

import pesquisa.domain.Form;

/**
 *
 * @author Gustavo
 */
public class FormViewPaper extends FormView{

    public FormViewPaper() {
    }

    public FormViewPaper(Form form) {
        super(form);
    }

    @Override
    public String getView() {
        String text = " ";
        for(int i = 0; i < form.getQuestions().size(); i++){
            QuestionView questionView = FactoryQuestion.createQuestionView(form.getQuestions().get(i), typeForm);
            questionView.setQuestion(form.getQuestions().get(i));
            text += questionView.getView();
        }
        
        return text;
    }
    
    
}
