/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa.domain;

/**
 *
 * @author Gustavo
 */
public class Option {
    
    private long id;
    
    private String textOption;
    
    private int valueOption;

    public Option() {
    }

    public Option(long id) {
        this.id = id;
    }

    public Option(long id, String textOption, int valueOption) {
        this.id = id;
        this.textOption = textOption;
        this.valueOption = valueOption;
    }

    public Option(String textOption) {
        this.textOption = textOption;
    }

    public Option(String textOption, int valueOption) {
        this.textOption = textOption;
        this.valueOption = valueOption;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTextOption() {
        return textOption;
    }

    public void setTextOption(String textOption) {
        this.textOption = textOption;
    }

    public int getValueOption() {
        return valueOption;
    }

    public void setValueOption(int valueOption) {
        this.valueOption = valueOption;
    }
    
    
    
}
