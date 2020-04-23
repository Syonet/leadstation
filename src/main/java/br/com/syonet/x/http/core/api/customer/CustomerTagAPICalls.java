package br.com.syonet.x.http.core.api.customer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CustomerTagAPICalls {
    @GET( "api/v1/customers/tags" )
    Call< List< String > > searchTag ( @Query( "search" ) String search );
}
