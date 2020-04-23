package br.com.syonet.x.http.core.api.product;

import java.util.ArrayList;
import java.util.List;

import br.com.syonet.x.model.product.Product;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ProductAPICalls {
    @GET( "products" )
    Call< ArrayList< Product > > getProducts ();

    @GET( "products" )
    Call< List< Product > > search ( @Query( "description" ) String description );
}
