package br.com.syonet.x.http.core.api.lossReason;

import java.util.List;

import br.com.syonet.x.model.lossReason.LossReason;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LossReasonAPICalls {
    @GET( "lossreasons" )
    Call< List< LossReason > > getLossReasons ();
}
