package br.com.syonet.x.http.core.api.source;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.source.Source;

public class SourceAPI {
    private SourceAPICalls api;

	public SourceAPI ( SourceAPICalls api ) {
    	this.api = api;
    }

    public ArrayList< Source > getSources () throws APICoreException, AppException {
        return executeCall( this.api.getSources() ).getContent();
    }
}
