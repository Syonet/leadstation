package br.com.syonet.x.http.core.internal.user;

import static br.com.syonet.x.http.core.API.executeCall;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;

public class UserAPIInternal {
    private UserAPIInternalCalls api;

	public UserAPIInternal (UserAPIInternalCalls api ) {
    	this.api = api;
    }

    public void sendPasswordRecoveryEmail ( String email ) throws APICoreException, AppException {
        executeCall( this.api.sendPasswordRecoveryEmail( email ) );
    }
}
