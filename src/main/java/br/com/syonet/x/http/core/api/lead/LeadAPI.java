package br.com.syonet.x.http.core.api.lead;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.model.lead.Lead;
import br.com.syonet.x.model.lead.LeadPatch;
import br.com.syonet.x.model.lead.LeadStatus;

public class LeadAPI {
    private LeadAPICalls api;

	public LeadAPI (LeadAPICalls api ) {
        this.api = api;
    }

    public Lead getLead ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.getLead( id ) ).getContent();
    }

    public APIResponse< List< Lead > > getLeads ( String to, String from, Integer sourceId, @LeadStatus String status,
                                                  int page ) throws APICoreException, AppException {
        return executeCall( this.api.getLeads( status, page, "createdAt", "DESC", to, from, sourceId ) );
    }

    public Lead patchLead ( UUID leadId, LeadPatch leadPatch ) throws APICoreException, AppException {
        return executeCall( this.api.patchLead( leadId, leadPatch.getBody() ) ).getContent();
    }
}
