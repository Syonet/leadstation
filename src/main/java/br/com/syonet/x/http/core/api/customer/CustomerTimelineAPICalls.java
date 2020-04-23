package br.com.syonet.x.http.core.api.customer;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.model.customer.CustomerTimeline;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CustomerTimelineAPICalls {
    @GET( "api/v1/customers/{id}/timeline" )
    Call< List< CustomerTimeline > > getTimeline ( @Path( "id" ) UUID id, @Query( "types" ) List< String > types,
                                                   @Query( "page" ) int page );
}
