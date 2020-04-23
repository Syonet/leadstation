package br.com.syonet.x.http.core.api.customer;

import java.util.ArrayList;
import java.util.UUID;

import br.com.syonet.x.model.customer.CustomerFile;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CustomerFileAPICalls {
    @GET( "api/v1/customers/{id}/files" )
    Call< ArrayList< CustomerFile > > getFiles ( @Path( "id" ) UUID customerId );

    @PUT( "api/v1/customers/{id}/files" )
    Call< CustomerFile > saveFile ( @Path( "id" ) UUID customerId, @Query( "fileName" ) String fileName,
                                    @Body RequestBody body );

    @DELETE( "api/v1/customers/files/{id}" )
    Call< Void > deleteFile ( @Path( "id" ) UUID id );

    @GET( "api/v1/customers/files/{id}" )
    Call< ResponseBody > downloadFile ( @Path( "id" ) UUID id );
}
