package br.com.syonet.x.model.phone;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { PhoneType.CELL_PHONE, PhoneType.COMMERCIAL, PhoneType.RESIDENTIAL } )
@Retention( RetentionPolicy.SOURCE )
public @interface PhoneType {
    String CELL_PHONE = "CELL_PHONE";
    String COMMERCIAL = "COMMERCIAL";
    String RESIDENTIAL = "RESIDENTIAL";
}