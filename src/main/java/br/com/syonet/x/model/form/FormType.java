package br.com.syonet.x.model.form;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { FormType.COMPANY, FormType.PERSON, FormType.OPPORTUNITY } )
@Retention( RetentionPolicy.SOURCE )
public @interface FormType {
    String COMPANY = "COMPANY";
    String PERSON = "PERSON";
    String OPPORTUNITY = "OPPORTUNITY";
}