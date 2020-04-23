package br.com.syonet.x.http.core.api.phase;

import java.util.ArrayList;
import java.util.UUID;

import com.google.gson.JsonElement;

import br.com.syonet.x.model.phase.Phase;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PhaseAPICalls {
    @GET( "api/v1/phases" )
    Call< ArrayList< Phase > > getPhases ();

    @POST( "api/v1/opportunities/{opportunityId}/phases/triggers" )
    Call< Void > sendTrigger ( @Path( "opportunityId" ) UUID opportunityId, @Body JsonElement body );
}
