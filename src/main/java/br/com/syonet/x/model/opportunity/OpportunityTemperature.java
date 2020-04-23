package br.com.syonet.x.model.opportunity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { OpportunityTemperature.COLD, OpportunityTemperature.WARM, OpportunityTemperature.HOT } )
@Retention( RetentionPolicy.SOURCE )
public @interface OpportunityTemperature {
    String COLD = "COLD";
    String WARM = "WARM";
    String HOT = "HOT";
}