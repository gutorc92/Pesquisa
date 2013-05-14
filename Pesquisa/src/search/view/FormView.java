/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search.view;

import search.domain.Form;

/**
 *
 * @author Gustavo
 */
public class FormView {
    
    public final static int VIEW_PAPER = 1;
    
    protected Form form;
    
    protected int typeForm;

    public FormView() {
    }

    public FormView(Form form) {
        this.form = form;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }
    
    public String getView(){
        return "";
    }
    
    
}
