package br.com.syonet.x.model.product;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { ProductMeasurementUnit.UNIT, ProductMeasurementUnit.METER, ProductMeasurementUnit.KILO,
        ProductMeasurementUnit.LITER, ProductMeasurementUnit.HOUR } )
@Retention( RetentionPolicy.SOURCE )
public @interface ProductMeasurementUnit {
    String UNIT = "UNIT";
    String METER = "METER";
    String KILO = "KILO";
    String LITER = "LITER";
    String HOUR = "HOUR";
}