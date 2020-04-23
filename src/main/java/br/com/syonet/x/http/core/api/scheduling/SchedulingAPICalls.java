package br.com.syonet.x.http.core.api.scheduling;

import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.opportunity.scheduling.OpportunitySchedulingType;
import br.com.syonet.x.model.scheduling.Scheduling;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SchedulingAPICalls {
    @GET( "api/v1/schedules" )
    Call< ArrayList< Scheduling > > getSchedules ( @Query( "startDate" ) String startDate,
                                                   @Query( "endDate" ) String endDate,
                                                   @Query( "usersId" ) Set< Integer > usersId );

    @POST( "api/v1/schedules" )
    Call< Scheduling > createScheduling ( @Body JsonObject body );

    @PATCH( "api/v1/schedules/{id}" )
    Call< Scheduling > patchScheduling ( @Path( "id" ) UUID id, @Body JsonObject body );

    @DELETE( "api/v1/schedules/{id}" )
    Call< Void > deleteScheduling ( @Path( "id" ) UUID id );

    @GET( "api/v1/schedules/{id}" )
    Call< Scheduling > getScheduling ( @Path( "id" ) UUID schedulingId );

    @GET( "api/v1/opportunities/{id}/schedules" )
    Call< ArrayList< Scheduling > > getOpportunitySchedules ( @Path( "id" ) UUID opportunityId );

    @GET( "api/v1/opportunities/schedules/types" )
    Call< ArrayList< OpportunitySchedulingType > > getOpportunitySchedulingTypes ();
}
