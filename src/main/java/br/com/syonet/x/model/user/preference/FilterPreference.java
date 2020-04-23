package br.com.syonet.x.model.user.preference;

import java.io.Serializable;

import br.com.syonet.x.model.form.Field;

public class FilterPreference implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int fieldId;
    @FilterPreferenceOperator
    private String operator;
    private Object value;

    private Field field;

    public int getFieldId () {
        return fieldId;
    }

    public void setFieldId ( int fieldId ) {
        this.fieldId = fieldId;
    }

    public
    @FilterPreferenceOperator
    String getOperator () {
        return operator;
    }

    public void setOperator ( @FilterPreferenceOperator String operator ) {
        this.operator = operator;
    }

    public Object getValue () {
        return value;
    }

    public void setValue ( Object value ) {
        this.value = value;
    }

    public Field getField () {
        return field;
    }

    public void setField ( Field field ) {
        this.field = field;
    }
}
