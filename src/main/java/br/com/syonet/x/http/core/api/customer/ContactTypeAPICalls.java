package br.com.syonet.x.http.core.api.customer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ContactTypeAPICalls {
    @GET( "customers/contacts/types" )
    Call< List< String > > search ( @Query( "search" ) String search );
}
