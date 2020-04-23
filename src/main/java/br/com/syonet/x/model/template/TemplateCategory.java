package br.com.syonet.x.model.template;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import br.com.syonet.x.model.IntDef;


@IntDef( { TemplateCategory.GENERAL, TemplateCategory.PERSONAL, TemplateCategory.SHARED } )
@Retention( RetentionPolicy.SOURCE )
public @interface TemplateCategory {
    int GENERAL = 0;
    int PERSONAL = 1;
    int SHARED = 2;
}