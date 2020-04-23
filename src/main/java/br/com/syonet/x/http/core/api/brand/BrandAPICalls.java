package br.com.syonet.x.http.core.api.brand;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BrandAPICalls {
    @GET( "brands/{brand}/models" )
    Call< List< String > > getModels ( @Path( "brand" ) String brand );
}
