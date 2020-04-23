package br.com.syonet.x.model.form;

import java.io.Serializable;

public class Field implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private int formId;
    private String name;
    @FieldType
    private String type;
    @SystemField
    private String systemField;
    private FieldOptions options;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public int getFormId () {
        return formId;
    }

    public void setFormId ( int formId ) {
        this.formId = formId;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public @FieldType String getType () {
        return type;
    }

    public void setType ( @FieldType String type ) {
        this.type = type;
    }

    public @SystemField String getSystemField () {
        return systemField;
    }

    public void setSystemField ( @SystemField String systemField ) {
        this.systemField = systemField;
    }

    public FieldOptions getOptions () {
        return options;
    }

    public void setOptions ( FieldOptions options ) {
        this.options = options;
    }
}
