package br.com.syonet.x.model.period;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.IntDef;

@IntDef( { Period.CUSTOM, Period.TODAY, Period.TOMORROW, Period.YESTERDAY, Period.THIS_WEEK, Period.LAST_WEEK,
        Period.THIS_MONTH, Period.LAST_MONTH, Period.THIS_QUARTER_YEAR, Period.LAST_QUARTER_YEAR, Period.THIS_YEAR,
        Period.LAST_YEAR } )
@Retention( RetentionPolicy.SOURCE )
public @interface Period {
    int CUSTOM = 0;
    int TODAY = 1;
    int TOMORROW = 2;
    int YESTERDAY = 3;
    int THIS_WEEK = 4;
    int LAST_WEEK = 5;
    int THIS_MONTH = 6;
    int LAST_MONTH = 7;
    int THIS_QUARTER_YEAR = 8;
    int LAST_QUARTER_YEAR = 9;
    int THIS_YEAR = 10;
    int LAST_YEAR = 11;
}