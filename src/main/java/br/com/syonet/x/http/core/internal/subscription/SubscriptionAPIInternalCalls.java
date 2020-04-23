package br.com.syonet.x.http.core.internal.subscription;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.subscription.Subscription;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface SubscriptionAPIInternalCalls {
    @POST( "i/v1/subscription" )
    Call< Subscription > createSubscription ( @Body JsonObject jsonObject );
}
