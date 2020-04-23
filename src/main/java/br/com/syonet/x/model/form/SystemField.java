package br.com.syonet.x.model.form;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { SystemField.CLOSING_AT, SystemField.NAME, SystemField.PRICE, SystemField.USER, SystemField.SOURCE,
        SystemField.BRAND, SystemField.MODEL, SystemField.EIN, SystemField.SSN } )
@Retention( RetentionPolicy.SOURCE )
public @interface SystemField {
    String CLOSING_AT = "CLOSING_AT";
    String NAME = "NAME";
    String PRICE = "PRICE";
    String USER = "USER";
    String SOURCE = "SOURCE";
    String BRAND = "BRAND";
    String MODEL = "MODEL";
    String EIN = "EIN";
    String SSN = "SSN";
}