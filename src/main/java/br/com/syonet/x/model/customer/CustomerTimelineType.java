package br.com.syonet.x.model.customer;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { CustomerTimelineType.CUSTOMER_CREATION, CustomerTimelineType.CUSTOMER_CONTACTS, CustomerTimelineType.SMS,
        CustomerTimelineType.OPPORTUNITY, CustomerTimelineType.CUSTOMER_CHANGE, CustomerTimelineType.CUSTOMER_COMMENT,
        CustomerTimelineType.PHONE_CALL, CustomerTimelineType.OPPORTUNITY_STATUS, CustomerTimelineType.WHATSAPP,
        CustomerTimelineType.EMAIL_SENT, CustomerTimelineType.EMAIL_RESPONSE } )
@Retention( RetentionPolicy.SOURCE )
public @interface CustomerTimelineType {
    String CUSTOMER_CREATION = "CUSTOMER_CREATION";
    String CUSTOMER_CHANGE = "CUSTOMER_CHANGE";
    String CUSTOMER_COMMENT = "CUSTOMER_COMMENT";
    String OPPORTUNITY = "OPPORTUNITY";
    String SMS = "SMS";
    String CUSTOMER_CONTACTS = "CUSTOMER_CONTACTS";
    String OPPORTUNITY_STATUS = "OPPORTUNITY_STATUS";
    String PHONE_CALL = "PHONE_CALL";
    String WHATSAPP = "WHATSAPP";
    String EMAIL_SENT = "EMAIL_SENT";
    String EMAIL_RESPONSE = "EMAIL_RESPONSE";
}