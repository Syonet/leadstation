package br.com.syonet.x.model.goal;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { GoalType.OPPORTUNITIES_CREATED, GoalType.SOLD_OPPORTUNITIES_PRICE, GoalType.AVERAGE_SERVICE_TIME } )
@Retention( RetentionPolicy.SOURCE )
public @interface GoalType {
    String OPPORTUNITIES_CREATED = "OPPORTUNITIES_CREATED";
    String SOLD_OPPORTUNITIES_PRICE = "SOLD_OPPORTUNITIES_PRICE";
    String AVERAGE_SERVICE_TIME = "AVERAGE_SERVICE_TIME";
}