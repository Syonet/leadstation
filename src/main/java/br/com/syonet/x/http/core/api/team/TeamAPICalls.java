package br.com.syonet.x.http.core.api.team;

import java.util.ArrayList;

import br.com.syonet.x.model.team.Team;
import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamAPICalls {
    @GET( "teams" )
    Call< ArrayList< Team > > getTeams ();
}