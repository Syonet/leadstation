package br.com.syonet.x.http.core.api.opportunity;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.model.opportunity.product.OpportunityProduct;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface OpportunityProductAPICalls {
    @GET( "opportunities/{id}/products" )
    Call< List< OpportunityProduct > > getOpportunityProducts ( @Path( "id" ) UUID opportunityId );

    @DELETE( "opportunities/products/{id}" )
    Call< Void > deleteOpportunityProduct ( @Path( "id" ) UUID opportunityProductId );

    @POST( "opportunities/{id}/products" )
    Call< OpportunityProduct > createOpportunityProduct ( @Path( "id" ) UUID opportunityId,
                                                          @Body OpportunityProduct body );

    @PATCH( "opportunities/products/{id}" )
    Call< OpportunityProduct > updateOpportunityProduct ( @Path( "id" ) UUID opportunityProductId,
                                                          @Body OpportunityProduct body );
}
