package br.com.syonet.x.model.address;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { AddressType.COMMERCIAL, AddressType.RESIDENTIAL, AddressType.OTHER } )
@Retention( RetentionPolicy.SOURCE )
public @interface AddressType {
    String COMMERCIAL = "COMMERCIAL";
    String RESIDENTIAL = "RESIDENTIAL";
    String OTHER = "OTHER";
}
