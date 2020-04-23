package br.com.syonet.x.model.opportunity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { OpportunityStatus.OPEN, OpportunityStatus.SOLD, OpportunityStatus.LOST } )
@Retention( RetentionPolicy.SOURCE )
public @interface OpportunityStatus {
    String OPEN = "OPEN";
    String SOLD = "SOLD";
    String LOST = "LOST";
}