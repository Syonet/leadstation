package br.com.syonet.x.http.core.api.customer;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;

public class CustomerTagAPI {
    private CustomerTagAPICalls api;

	public CustomerTagAPI( CustomerTagAPICalls api ) {
    	this.api = api;
	}

    public List< String > searchTag ( String search ) throws APICoreException, AppException {
        return executeCall( this.api.searchTag( search ) ).getContent();
    }
}