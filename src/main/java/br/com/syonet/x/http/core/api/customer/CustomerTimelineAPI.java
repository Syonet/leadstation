package br.com.syonet.x.http.core.api.customer;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.model.customer.CustomerTimeline;

public class CustomerTimelineAPI {
    private CustomerTimelineAPICalls api;

	public CustomerTimelineAPI (CustomerTimelineAPICalls  api ) {
    	this.api = api;
    }

    public APIResponse< List< CustomerTimeline > > getTimeline ( UUID customerId, List< String > types, int page )
            throws APICoreException, AppException {
        return executeCall( this.api.getTimeline( customerId, types, page ) );
    }
}
