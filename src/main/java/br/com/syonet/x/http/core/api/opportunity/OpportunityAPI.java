package br.com.syonet.x.http.core.api.opportunity;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.funnel.Funnel;
import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.opportunity.OpportunityCheckin;
import br.com.syonet.x.model.opportunity.OpportunityComment;
import br.com.syonet.x.model.opportunity.OpportunityOrderBy;
import br.com.syonet.x.model.opportunity.OpportunityPatch;
import br.com.syonet.x.model.opportunity.OpportunityStatistics;
import br.com.syonet.x.model.opportunity.OpportunityStatus;
import br.com.syonet.x.util.DateISOUtils;

public class OpportunityAPI {
    private OpportunityAPICalls api;
	public OpportunityAPI (OpportunityAPICalls api) {
		this.api = api;
    }

    public Opportunity getOpportunity ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.getOpportunity( id ) ).getContent();
    }

    public APIResponse< List< Opportunity > > getOpportunities ( int page, @OpportunityStatus String status,
                                                                 int funnelId )
            throws APICoreException, AppException {
        return executeCall( this.api.getOpportunities( page, OpportunityOrderBy.NEXT_SCHEDULING,
                status, funnelId ) );
    }

    public APIResponse< List< Opportunity > > getOpportunities ( int page, @OpportunityStatus String status,
                                                                 int funnelId, int phaseId )
            throws APICoreException, AppException {
        return executeCall( this.api.getOpportunities( page, OpportunityOrderBy.NEXT_SCHEDULING,
                status, funnelId, phaseId ) );
    }

    public APIResponse< List< Opportunity > > getOpportunities ( int page, Date initialCreatedAt, Date finalCreatedAt,
                                                                 Date initialClosingAt, Date finalClosingAt,
                                                                 Date initialUpdatedAt, Date finalUpdatedAt,
                                                                 Boolean hasOpenScheduling, Set< Integer > users,
                                                                 String status, String temperature,
                                                                 String lossReasonId )
            throws APICoreException, AppException {
        return executeCall( this.api.getOpportunities( page, DateISOUtils.fromDate( initialCreatedAt ),
                DateISOUtils.fromDate( finalCreatedAt ), DateISOUtils.fromDate( initialClosingAt ),
                DateISOUtils.fromDate( finalClosingAt ), DateISOUtils.fromDate( initialUpdatedAt ),
                DateISOUtils.fromDate( finalUpdatedAt ), hasOpenScheduling, users, status, temperature, lossReasonId,
                true ) );
    }

    public APIResponse< ArrayList< Opportunity > > getAccountOpportunities ( UUID customerId ) throws APICoreException,
            AppException {
        return executeCall( this.api.getCustomerOpportunities( customerId ) );
    }

    public List< Opportunity > search ( String name ) throws APICoreException, AppException {
        return executeCall( this.api.search( name ) ).getContent();
    }

    public Opportunity patchOpportunity ( UUID opportunityId, OpportunityPatch opportunityPatch )
            throws APICoreException, AppException {
        return executeCall( this.api.patchOpportunity( opportunityId, opportunityPatch.getBody() ) )
                .getContent();
    }

    public Opportunity putOpportunity ( UUID opportunityId, JsonObject opportunityFields ) throws APICoreException,
            AppException {
        return executeCall( this.api.putOpportunity( opportunityId, opportunityFields ) ).getContent();
    }

    public Opportunity createOpportunity ( UUID companyId, UUID personId, JsonObject opportunityFields, Funnel funnel )
            throws APICoreException, AppException {
        JsonObject companyObject = null;
        if ( companyId != null ) {
            companyObject = new JsonObject();
            companyObject.addProperty( "id", companyId.toString() );
        }

        JsonObject personObject = null;
        if ( personId != null ) {
            personObject = new JsonObject();
            personObject.addProperty( "id", personId.toString() );
        }

        JsonObject jsonObject = new JsonObject();
        jsonObject.add( "company", companyObject );
        jsonObject.add( "person", personObject );
        jsonObject.add( "fields", opportunityFields );
        jsonObject.addProperty( "funnelId", funnel.getId() );

        return executeCall( this.api.createOpportunity( jsonObject ) ).getContent();
    }

    public OpportunityComment createComment ( UUID opportunityId, OpportunityComment comment )
            throws APICoreException, AppException {
        return executeCall( this.api.createComment( opportunityId, comment ) ).getContent();
    }

    public OpportunityCheckin checkin ( UUID opportunityId, OpportunityCheckin checkin )
            throws APICoreException, AppException {
        return executeCall( this.api.checkin( opportunityId, checkin ) ).getContent();
    }

    public OpportunityStatistics getStatistics ( Date initialDate, Date finalDate, Set< Integer > users,
                                                 Integer funnelId ) throws APICoreException, AppException {
        return executeCall( this.api.getStatistics( DateISOUtils.fromDate( initialDate ),
                DateISOUtils.fromDate( finalDate ), users, funnelId ) ).getContent();
    }

    public ArrayList< Customer > getContacts ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.getContacts( id ) ).getContent();
    }

    public void saveContact ( UUID opportunityId, UUID customerId ) throws APICoreException, AppException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty( "contactId", customerId.toString() );

        executeCall( this.api.saveContact( opportunityId, jsonObject ) );
    }

    public void deleteContact ( UUID opportunityId, UUID contactId ) throws APICoreException, AppException {
        executeCall( this.api.deleteContact( opportunityId, contactId ) );
    }
}
