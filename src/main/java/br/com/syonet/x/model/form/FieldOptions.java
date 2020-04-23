package br.com.syonet.x.model.form;

import java.io.Serializable;
import java.util.HashSet;

public class FieldOptions implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean required;
    private boolean mainScreen;
    private boolean summary;
    private HashSet< Object > values;

    public boolean isRequired () {
        return required;
    }

    public void setRequired ( boolean required ) {
        this.required = required;
    }

    public boolean isMainScreen () {
        return mainScreen;
    }

    public void setMainScreen ( boolean mainScreen ) {
        this.mainScreen = mainScreen;
    }

    public boolean isSummary () {
        return summary;
    }

    public void setSummary ( boolean summary ) {
        this.summary = summary;
    }

    public HashSet< Object > getValues () {
        return values;
    }

    public void setValues ( HashSet< Object > values ) {
        this.values = values;
    }
}