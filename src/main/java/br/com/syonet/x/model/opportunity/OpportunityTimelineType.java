package br.com.syonet.x.model.opportunity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { OpportunityTimelineType.OPPORTUNITY_CREATION, OpportunityTimelineType.OPPORTUNITY_CHANGE,
        OpportunityTimelineType.OPPORTUNITY_PHASE, OpportunityTimelineType.OPPORTUNITY_STATUS,
        OpportunityTimelineType.OPPORTUNITY_TEMPERATURE, OpportunityTimelineType.OPPORTUNITY_COMMENT,
        OpportunityTimelineType.OPPORTUNITY_SCHEDULING_CREATION, OpportunityTimelineType.SMS,
        OpportunityTimelineType.OPPORTUNITY_SCHEDULING_CHANGE, OpportunityTimelineType.OPPORTUNITY_SCHEDULING_STATUS,
        OpportunityTimelineType.OPPORTUNITY_PRODUCTS, OpportunityTimelineType.PHONE_CALL,
        OpportunityTimelineType.WHATSAPP, OpportunityTimelineType.EMAIL_SENT, OpportunityTimelineType.EMAIL_RESPONSE,
        OpportunityTimelineType.OPPORTUNITY_CHECKIN, OpportunityTimelineType.PERSON, OpportunityTimelineType.COMPANY } )
@Retention( RetentionPolicy.SOURCE )
public @interface OpportunityTimelineType {
    String OPPORTUNITY_CREATION = "OPPORTUNITY_CREATION";
    String OPPORTUNITY_CHANGE = "OPPORTUNITY_CHANGE";
    String OPPORTUNITY_CHECKIN = "OPPORTUNITY_CHECKIN";
    String OPPORTUNITY_PHASE = "OPPORTUNITY_PHASE";
    String OPPORTUNITY_STATUS = "OPPORTUNITY_STATUS";
    String OPPORTUNITY_TEMPERATURE = "OPPORTUNITY_TEMPERATURE";
    String OPPORTUNITY_COMMENT = "OPPORTUNITY_COMMENT";
    String OPPORTUNITY_SCHEDULING_CREATION = "OPPORTUNITY_SCHEDULING_CREATION";
    String SMS = "SMS";
    String OPPORTUNITY_SCHEDULING_CHANGE = "OPPORTUNITY_SCHEDULING_CHANGE";
    String OPPORTUNITY_SCHEDULING_STATUS = "OPPORTUNITY_SCHEDULING_STATUS";
    String OPPORTUNITY_PRODUCTS = "OPPORTUNITY_PRODUCTS";
    String PHONE_CALL = "PHONE_CALL";
    String WHATSAPP = "WHATSAPP";
    String EMAIL_SENT = "EMAIL_SENT";
    String EMAIL_RESPONSE = "EMAIL_RESPONSE";
    String PERSON = "PERSON";
    String COMPANY = "COMPANY";
}