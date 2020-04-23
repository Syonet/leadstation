package br.com.syonet.x.http.core.api.opportunity;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.opportunity.product.OpportunityProduct;

public class OpportunityProductAPI {
    private OpportunityProductAPICalls api;

	public OpportunityProductAPI ( OpportunityProductAPICalls api ) {
        this.api = api;
    }

    public List< OpportunityProduct > getProducts ( UUID opportunityId ) throws APICoreException,
            AppException {
        return executeCall( this.api.getOpportunityProducts( opportunityId ) ).getContent();
    }

    public void deleteOpportunityProduct ( UUID opportunityProductId ) throws APICoreException, AppException {
        executeCall( this.api.deleteOpportunityProduct( opportunityProductId ) );
    }

    public OpportunityProduct createOpportunityProduct ( UUID opportunityId, OpportunityProduct opportunityProduct )
            throws APICoreException, AppException {
        return executeCall( this.api.createOpportunityProduct( opportunityId, opportunityProduct ) )
                .getContent();
    }

    public OpportunityProduct updateOpportunityProduct ( UUID opportunityProductId,
                                                         OpportunityProduct opportunityProduct )
            throws APICoreException, AppException {
        return executeCall( this.api.updateOpportunityProduct( opportunityProductId,
                opportunityProduct ) ).getContent();
    }
}
