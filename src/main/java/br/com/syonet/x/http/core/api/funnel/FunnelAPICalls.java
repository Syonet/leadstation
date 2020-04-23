package br.com.syonet.x.http.core.api.funnel;

import java.util.ArrayList;

import br.com.syonet.x.model.funnel.Funnel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FunnelAPICalls {
    @GET( "api/v1/funnels" )
    Call< ArrayList< Funnel > > getFunnels ();
}