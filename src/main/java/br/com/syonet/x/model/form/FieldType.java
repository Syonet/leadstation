package br.com.syonet.x.model.form;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { FieldType.TEXT, FieldType.EMAIL, FieldType.DATE, FieldType.PHONE, FieldType.NUMBER, FieldType.ADDRESS,
        FieldType.SELECT, FieldType.SELECT_MULTIPLE, FieldType.GROUPING } )
@Retention( RetentionPolicy.SOURCE )
public @interface FieldType {
    String TEXT = "TEXT";
    String EMAIL = "EMAIL";
    String DATE = "DATE";
    String PHONE = "PHONE";
    String NUMBER = "NUMBER";
    String ADDRESS = "ADDRESS";
    String SELECT = "SELECT";
    String SELECT_MULTIPLE = "SELECT_MULTIPLE";
    String GROUPING = "GROUPING";
}
