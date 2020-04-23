package br.com.syonet.x.http.core.api.form;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.form.Field;
import br.com.syonet.x.model.form.FormType;

public class FieldAPI {
	private FieldAPICalls api;
    public FieldAPI ( FieldAPICalls api ) {
        this.api = api;
    }

    public ArrayList< Field > getCompanyFields () throws APICoreException, AppException {
        return list( FormType.COMPANY );
    }

    public ArrayList< Field > getPersonFields () throws APICoreException, AppException {
        return list( FormType.PERSON );
    }

    public ArrayList< Field > getOpportunityFields () throws APICoreException, AppException {
        return list( FormType.OPPORTUNITY );
    }

    private ArrayList< Field > list ( @FormType String formType ) throws APICoreException, AppException {
        return executeCall( this.api.getFields( formType ) ).getContent();
    }

    public ArrayList< Field > getCompanyFilterFields () throws APICoreException, AppException {
        return getFilterFields( FormType.COMPANY );
    }

    public ArrayList< Field > getPersonFilterFields () throws APICoreException, AppException {
        return getFilterFields( FormType.PERSON );
    }

    public ArrayList< Field > getOpportunityFilterFields () throws APICoreException, AppException {
        return getFilterFields( FormType.OPPORTUNITY );
    }

    private ArrayList< Field > getFilterFields ( @FormType String formType ) throws APICoreException, AppException {
        return executeCall( this.api.getFilterFields( formType ) ).getContent();
    }
}