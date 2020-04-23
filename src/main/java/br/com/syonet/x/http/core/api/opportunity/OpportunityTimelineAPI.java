package br.com.syonet.x.http.core.api.opportunity;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.model.opportunity.OpportunityTimeline;

public class OpportunityTimelineAPI {
	
	private OpportunityTimelineAPICalls api;
	
    public OpportunityTimelineAPI( OpportunityTimelineAPICalls api ) {
    	this.api = api;
    }

    public APIResponse< List< OpportunityTimeline > > getTimeline ( UUID opportunityId, List< String > types, int page )
            throws APICoreException, AppException {
        return executeCall( this.api.getTimeline( opportunityId, types, page ) );
    }
}
