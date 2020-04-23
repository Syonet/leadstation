package br.com.syonet.x.http.core.api.opportunity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.opportunity.OpportunityCheckin;
import br.com.syonet.x.model.opportunity.OpportunityComment;
import br.com.syonet.x.model.opportunity.OpportunityStatistics;
import br.com.syonet.x.model.opportunity.OpportunityStatus;
import br.com.syonet.x.model.opportunity.OpportunityTemperature;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpportunityAPICalls {
    @GET( "api/v1/opportunities/{id}" )
    Call< Opportunity > getOpportunity ( @Path( "id" ) UUID id );

    @GET( "api/v1/opportunities" )
    Call< List< Opportunity > > getOpportunities ( @Query( "page" ) int page, @Query( "orderBy" ) String orderBy,
                                                   @Query( "status" ) @OpportunityStatus String status,
                                                   @Query( "funnelId" ) int funnelId );

    @GET( "api/v1/opportunities" )
    Call< List< Opportunity > > getOpportunities ( @Query( "page" ) int page, @Query( "orderBy" ) String orderBy,
                                                   @Query( "status" ) @OpportunityStatus String status,
                                                   @Query( "funnelId" ) int funnelId,
                                                   @Query( "phaseId" ) int phaseId );

    @GET( "api/v1/opportunities" )
    Call< List< Opportunity > > getOpportunities ( @Query( "page" ) int page,
                                                   @Query( "initialCreatedAt" ) String initialCreatedAt,
                                                   @Query( "finalCreatedAt" ) String finalCreatedAt,
                                                   @Query( "initialClosingAt" ) String initialClosingAt,
                                                   @Query( "finalClosingAt" ) String finalClosingAt,
                                                   @Query( "initialUpdatedAt" ) String initialUpdatedAt,
                                                   @Query( "finalUpdatedAt" ) String finalUpdatedAt,
                                                   @Query( "hasOpenScheduling" ) Boolean hasOpenScheduling,
                                                   @Query( "users" ) Set< Integer > users,
                                                   @Query( "status" ) @OpportunityStatus String status,
                                                   @Query( "temperature" ) @OpportunityTemperature String temperature,
                                                   @Query( "lossReasonId" ) String lossReasonId,
                                                   @Query( "ignoreUserPreferences" ) boolean ignoreUserPreferences );

    @GET( "api/v1/customers/{customerId}/opportunities" )
    Call< ArrayList< Opportunity > > getCustomerOpportunities ( @Path( "customerId" ) UUID customerId );

    @GET( "api/v1/opportunities/search" )
    Call< List< Opportunity > > search ( @Query( "name" ) String name );

    @PATCH( "api/v1/opportunities/{id}" )
    Call< Opportunity > patchOpportunity ( @Path( "id" ) UUID id, @Body JsonObject body );

    @PUT( "api/v1/opportunities/{id}" )
    Call< Opportunity > putOpportunity ( @Path( "id" ) UUID id, @Body JsonObject body );

    @POST( "api/v1/opportunities" )
    Call< Opportunity > createOpportunity ( @Body JsonObject body );

    @POST( "api/v1/opportunities/{id}/comments" )
    Call< OpportunityComment > createComment ( @Path( "id" ) UUID opportunityId, @Body OpportunityComment body );

    @POST( "api/v1/opportunities/{id}/checkin" )
    Call< OpportunityCheckin > checkin ( @Path( "id" ) UUID opportunityId, @Body OpportunityCheckin body );

    @GET( "api/v1/opportunities/statistics" )
    Call< OpportunityStatistics > getStatistics ( @Query( "initialDate" ) String initialDate,
                                                  @Query( "finalDate" ) String finalDate,
                                                  @Query( "users" ) Set< Integer > users,
                                                  @Query( "funnelId" ) Integer funnelId );

    @GET( "api/v1/opportunities/{id}/contacts" )
    Call< ArrayList< Customer > > getContacts ( @Path( "id" ) UUID id );

    @PUT( "api/v1/opportunities/{id}/contacts" )
    Call< Void > saveContact ( @Path( "id" ) UUID id, @Body JsonObject body );

    @DELETE( "api/v1/opportunities/{opportunityId}/contacts/{contactId}" )
    Call< Void > deleteContact ( @Path( "opportunityId" ) UUID opportunityId, @Path( "contactId" ) UUID contactId );
}
