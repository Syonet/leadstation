package br.com.syonet.x.model.scheduling;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { SchedulingStatus.OPEN, SchedulingStatus.ACCOMPLISHED, SchedulingStatus.NOT_ACCOMPLISHED } )
@Retention( RetentionPolicy.SOURCE )
public @interface SchedulingStatus {
    String OPEN = "OPEN";
    String ACCOMPLISHED = "ACCOMPLISHED";
    String NOT_ACCOMPLISHED = "NOT_ACCOMPLISHED";
}
