package br.com.syonet.x.http.core.api.lead;

import java.util.List;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.lead.Lead;
import br.com.syonet.x.model.lead.LeadStatus;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LeadAPICalls {
    @GET( "api/v1/leads/{id}" )
    Call< Lead > getLead ( @Path( "id" ) UUID id );

    @GET( "api/v1/leads" )
    Call< List< Lead > > getLeads ( @Query( "status" ) @LeadStatus String status, @Query( "page" ) int page,
                                    @Query( "orderBy" ) String orderBy, @Query( "orderType" ) String orderType,
                                    @Query( "to" ) String to, @Query( "from" ) String from,
                                    @Query( "sourceId" ) Integer sourceId );

    @PATCH( "api/v1/leads/{id}" )
    Call< Lead > patchLead ( @Path( "id" ) UUID id, @Body JsonObject body );
}
