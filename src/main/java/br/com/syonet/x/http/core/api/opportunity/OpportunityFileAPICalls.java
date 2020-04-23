package br.com.syonet.x.http.core.api.opportunity;

import java.util.ArrayList;
import java.util.UUID;

import br.com.syonet.x.model.opportunity.OpportunityFile;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpportunityFileAPICalls {
    @GET( "opportunities/{id}/files" )
    Call< ArrayList< OpportunityFile > > getFiles ( @Path( "id" ) UUID opportunityId );

    @PUT( "opportunities/{id}/files" )
    Call< OpportunityFile > saveFile ( @Path( "id" ) UUID opportunityId, @Query( "fileName" ) String fileName,
                                       @Body RequestBody body );

    @DELETE( "opportunities/files/{id}" )
    Call< Void > deleteFile ( @Path( "id" ) UUID id );

    @GET( "opportunities/files/{id}" )
    Call< ResponseBody > downloadFile ( @Path( "id" ) UUID id );
}
