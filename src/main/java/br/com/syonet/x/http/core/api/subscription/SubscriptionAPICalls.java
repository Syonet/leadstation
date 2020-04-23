package br.com.syonet.x.http.core.api.subscription;

import br.com.syonet.x.model.subscription.Subscription;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface SubscriptionAPICalls {
    @GET( "subscription" )
    Call< Subscription > getSubscription ( @Header( "Authorization" ) String authorization );
}