package br.com.syonet.x.model.lead;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { LeadStatus.OPEN, LeadStatus.DISCARTED, LeadStatus.CONVERTED } )
@Retention( RetentionPolicy.SOURCE )
public @interface LeadStatus {
    String OPEN = "OPEN";
    String DISCARTED = "DISCARTED";
    String CONVERTED = "CONVERTED";
}