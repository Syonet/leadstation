package br.com.syonet.x.http.core.internal.subscription;

import com.google.gson.JsonObject;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.segment.Segment;
import br.com.syonet.x.model.subscription.Subscription;
import br.com.syonet.x.model.user.User;
import br.com.syonet.x.util.gson.GsonUtils;
import static br.com.syonet.x.http.core.API.executeCall;

public class SubscriptionAPIInternal {
    private SubscriptionAPIInternalCalls api;

	public SubscriptionAPIInternal (SubscriptionAPIInternalCalls api) {
        this.api = api;
    }

    public Subscription createSubscription ( String name, String phoneCountry, String phoneNumber, User user,
                                             Segment segment, String coupon ) throws APICoreException, AppException {
        JsonObject userJsonObject = new JsonObject();
        userJsonObject.addProperty( "name", user.getName() );
        userJsonObject.addProperty( "email", user.getEmail() );
        userJsonObject.addProperty( "password", user.getPassword() );

        JsonObject phoneJsonObject = new JsonObject();
        phoneJsonObject.addProperty( "country", phoneCountry );
        phoneJsonObject.addProperty( "number", phoneNumber );

        JsonObject subscriptionJsonObject = new JsonObject();
        subscriptionJsonObject.addProperty( "name", name );
        subscriptionJsonObject.add( "phone", phoneJsonObject );
        subscriptionJsonObject.add( "user", userJsonObject );
        subscriptionJsonObject.add( "segment", GsonUtils.getGson().toJsonTree( segment, Segment.class ) );
        subscriptionJsonObject.addProperty( "coupon", coupon );

        return executeCall( this.api.createSubscription( subscriptionJsonObject ) ).getContent();
    }
}
