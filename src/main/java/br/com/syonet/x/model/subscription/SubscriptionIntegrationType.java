package br.com.syonet.x.model.subscription;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { SubscriptionIntegrationType.LEAD, SubscriptionIntegrationType.SMS } )
@Retention( RetentionPolicy.SOURCE )
public @interface SubscriptionIntegrationType {
    String LEAD = "LEAD";
    String SMS = "SMS";
}