package br.com.syonet.x.http.core.api.subscription;

import static br.com.syonet.x.http.core.API.executeCall;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.subscription.Subscription;

public class SubscriptionAPI {
    private SubscriptionAPICalls api;
	public SubscriptionAPI ( SubscriptionAPICalls api ) {
    	this.api = api;
    }

    public Subscription getSubscription () throws APICoreException, AppException {
        return executeCall( api.getSubscription() ).getContent();
    }
}
