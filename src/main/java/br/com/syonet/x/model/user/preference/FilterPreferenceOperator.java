package br.com.syonet.x.model.user.preference;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { FilterPreferenceOperator.EQUAL, FilterPreferenceOperator.NOT_EQUAL, FilterPreferenceOperator.LIKE,
        FilterPreferenceOperator.NOT_LIKE, FilterPreferenceOperator.NULL, FilterPreferenceOperator.NOT_NULL,
        FilterPreferenceOperator.IN, FilterPreferenceOperator.BETWEEN } )
@Retention( RetentionPolicy.SOURCE )
public @interface FilterPreferenceOperator {
    String EQUAL = "EQUAL";
    String NOT_EQUAL = "NOT_EQUAL";
    String LIKE = "LIKE";
    String NOT_LIKE = "NOT_LIKE";
    String NULL = "NULL";
    String NOT_NULL = "NOT_NULL";
    String IN = "IN";
    String BETWEEN = "BETWEEN";
}