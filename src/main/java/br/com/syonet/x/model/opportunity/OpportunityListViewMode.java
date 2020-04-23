package br.com.syonet.x.model.opportunity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.IntDef;

@IntDef( { OpportunityListViewMode.KANBAN, OpportunityListViewMode.LIST } )
@Retention( RetentionPolicy.SOURCE )
public @interface OpportunityListViewMode {
    int KANBAN = 1;
    int LIST = 2;
}