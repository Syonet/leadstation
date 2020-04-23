package br.com.syonet.x.model.scheduling;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.IntDef;

@IntDef( { SchedulingViewMode.MONTH, SchedulingViewMode.DAY, SchedulingViewMode.THREE_DAYS, SchedulingViewMode.LIST } )
@Retention( RetentionPolicy.SOURCE )
public @interface SchedulingViewMode {
    int MONTH = 1;
    int DAY = 2;
    int THREE_DAYS = 3;
    int LIST = 4;
}