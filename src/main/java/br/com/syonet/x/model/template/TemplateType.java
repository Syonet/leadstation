package br.com.syonet.x.model.template;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.StringDef;

@StringDef( { TemplateType.EMAIL, TemplateType.SMS } )
@Retention( RetentionPolicy.SOURCE )
public @interface TemplateType {
    String EMAIL = "EMAIL";
    String SMS = "SMS";
}