package br.com.syonet.x.http.core.api.opportunity;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.model.opportunity.OpportunityTimeline;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpportunityTimelineAPICalls {
    @GET( "api/v1/opportunities/{id}/timeline" )
    Call< List< OpportunityTimeline > > getTimeline ( @Path( "id" ) UUID id, @Query( "types" ) List< String > types,
                                                      @Query( "page" ) int page );
}
