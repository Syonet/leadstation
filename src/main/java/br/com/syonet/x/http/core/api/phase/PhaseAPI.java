package br.com.syonet.x.http.core.api.phase;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;
import java.util.UUID;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.phase.Phase;

public class PhaseAPI {
	private PhaseAPICalls api;
    
    public PhaseAPI(PhaseAPICalls api) {
		this.api = api;
	}

	public ArrayList< Phase > getPhases () throws APICoreException, AppException {
        return executeCall( this.api.getPhases() ).getContent();
    }

    public void sendTrigger ( UUID opportunityId, int phaseId, String body ) throws APICoreException, AppException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty( "id", phaseId );
        jsonObject.addProperty( "body", body );

        JsonArray jsonArray = new JsonArray();
        jsonArray.add( jsonObject );

        executeCall( this.api.sendTrigger( opportunityId, jsonArray ) );
    }
}
