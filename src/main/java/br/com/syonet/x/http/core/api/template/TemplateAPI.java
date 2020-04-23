package br.com.syonet.x.http.core.api.template;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.template.Template;
import br.com.syonet.x.model.template.TemplateCategory;
import br.com.syonet.x.model.template.TemplateType;

public class TemplateAPI { 
	private TemplateAPICalls api;
	
    public TemplateAPI ( TemplateAPICalls api ) {
        this.api = api;
    }

    public ArrayList< Template > getTemplates ( @TemplateType String templateType, int sessionUserId ) throws APICoreException,
            AppException {
        ArrayList< Template > filteredTemplates = new ArrayList<>();

        List< Template > templates = executeCall( api.getTemplates() ).getContent();

        //filtro por tipo
        for ( Template template : templates ) {
            if ( template.getType().equals( templateType ) ) {
                //seta categoria
                template.setCategory( getTemplateCategory( template, sessionUserId ) );
                filteredTemplates.add( template );
            }
        }

        //ordenação por categoria
        Collections.sort( filteredTemplates, new Comparator<Template>() {
            @Override
            public int compare ( Template template1, Template template2 ) {
                return template1.getCategory() - template2.getCategory();
            }
        } );

        return filteredTemplates;
    }

    private int getTemplateCategory ( Template template, int sessionUserId ) {
        if ( template.getUser() == null ) {
            //geral
            return TemplateCategory.GENERAL;
        }

        if ( template.getUser().getId() == sessionUserId ) {
            //pessoal
            return TemplateCategory.PERSONAL;
        }

        //compartilhado
        return TemplateCategory.SHARED;
    }
}