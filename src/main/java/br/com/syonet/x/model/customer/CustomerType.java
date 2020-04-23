package br.com.syonet.x.model.customer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { CustomerType.COMPANY, CustomerType.PERSON } )
@Retention( RetentionPolicy.SOURCE )
public @interface CustomerType {
    String COMPANY = "COMPANY";
    String PERSON = "PERSON";
}
