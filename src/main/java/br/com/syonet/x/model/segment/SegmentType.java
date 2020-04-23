package br.com.syonet.x.model.segment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { SegmentType.AESTHETIC, SegmentType.AUTOMOTIVE, SegmentType.EDUCATION, SegmentType.HEALTH,
        SegmentType.INSURANCE, SegmentType.OTHER, SegmentType.REALSTATE, SegmentType.RETAIL, SegmentType.TELECOM } )
@Retention( RetentionPolicy.SOURCE )
public @interface SegmentType {
    String AESTHETIC = "AESTHETIC";
    String AUTOMOTIVE = "AUTOMOTIVE";
    String EDUCATION = "EDUCATION";
    String HEALTH = "HEALTH";
    String INSURANCE = "INSURANCE";
    String OTHER = "OTHER";
    String REALSTATE = "REALSTATE";
    String RETAIL = "RETAIL";
    String TELECOM = "TELECOM";
}