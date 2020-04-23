package br.com.syonet.x.http.core.api.subscription;

import br.com.syonet.x.model.subscription.Subscription;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SubscriptionAPICalls {
    @GET( "api/v1/subscription" )
    Call< Subscription > getSubscription ();
}