package br.com.syonet.x.model.integration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { IntegrationChannel.FACEBOOK, IntegrationChannel.LEADLOVERS, IntegrationChannel.MKT2EASY,
        IntegrationChannel.RD_STATION, IntegrationChannel.OTHER } )
@Retention( RetentionPolicy.SOURCE )
public @interface IntegrationChannel {
    String FACEBOOK = "FACEBOOK";
    String LEADLOVERS = "LEADLOVERS";
    String MKT2EASY = "MKT2EASY";
    String RD_STATION = "RD_STATION";
    String OTHER = "OTHER";
}