package br.com.syonet.x.http.core.api.team;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.team.Team;

public class TeamAPI {
    private TeamAPICalls api;

	public TeamAPI ( TeamAPICalls api ) {
    	this.api = api;
    }

    public ArrayList< Team > getTeams () throws APICoreException, AppException {
        return executeCall( api.getTeams() ).getContent();
    }
}
