package br.com.syonet.x.http.core.api.source;

import java.util.ArrayList;

import br.com.syonet.x.model.source.Source;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SourceAPICalls {
    @GET( "api/v1/sources" )
    Call< ArrayList< Source > > getSources ();
}
