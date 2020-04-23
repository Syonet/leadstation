package br.com.syonet.x.model.sms;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { SmsStatus.PENDING, SmsStatus.UNDELIVERABLE, SmsStatus.DELIVERED, SmsStatus.EXPIRED, SmsStatus.REJECTED } )
@Retention( RetentionPolicy.SOURCE )
public @interface SmsStatus {
    String PENDING = "PENDING";
    String UNDELIVERABLE = "UNDELIVERABLE";
    String DELIVERED = "DELIVERED";
    String EXPIRED = "EXPIRED";
    String REJECTED = "REJECTED";
}