package br.com.syonet.x.model.opportunity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { OpportunityOrderBy.CUSTOMER, OpportunityOrderBy.NEXT_SCHEDULING, OpportunityOrderBy.PHASE } )
@Retention( RetentionPolicy.SOURCE )
public @interface OpportunityOrderBy {
    String CUSTOMER = "customer";
    String NEXT_SCHEDULING = "nextScheduling";
    String PHASE = "phase";
}