package br.com.syonet.x.model.segment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { BrandType.CAR, BrandType.MOTORCYCLE, BrandType.TRUCK } )
@Retention( RetentionPolicy.SOURCE )
public @interface BrandType {
    String CAR = "CAR";
    String MOTORCYCLE = "MOTORCYCLE";
    String TRUCK = "TRUCK";
}