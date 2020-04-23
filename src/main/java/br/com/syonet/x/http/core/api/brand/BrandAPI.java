package br.com.syonet.x.http.core.api.brand;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;

public class BrandAPI {
    private BrandAPICalls api;

	public BrandAPI (BrandAPICalls api ) {
    	this.api = api;
    }

    public List< String > getModels ( String brand ) throws APICoreException,
            AppException {
        return executeCall( this.api.getModels( brand ) ).getContent();
    }
}
