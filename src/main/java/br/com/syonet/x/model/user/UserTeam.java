package br.com.syonet.x.model.user;

import java.io.Serializable;

import br.com.syonet.x.model.team.Team;

public class UserTeam implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean leader;
    private Team team;

    public boolean isLeader () {
        return leader;
    }

    public void setLeader ( boolean leader ) {
        this.leader = leader;
    }

    public Team getTeam () {
        return team;
    }

    public void setTeam ( Team team ) {
        this.team = team;
    }
}
