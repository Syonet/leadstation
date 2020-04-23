package br.com.syonet.x.model.user.preference;

import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

public class OpportunityUserPreference extends UserPreference {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer teamId;
    private HashSet< Integer > users;
    private HashSet< UUID > products;
    private Map< String, Object > schedulingDate;

    public Integer getTeamId () {
        return teamId;
    }

    public void setTeamId ( Integer teamId ) {
        this.teamId = teamId;
    }

    public HashSet< Integer > getUsers () {
        return users;
    }

    public void setUsers ( HashSet< Integer > users ) {
        this.users = users;
    }

    public HashSet< UUID > getProducts () {
        return products;
    }

    public void setProducts ( HashSet< UUID > products ) {
        this.products = products;
    }

    public Map< String, Object > getSchedulingDate () {
        return schedulingDate;
    }

    public void setSchedulingDate ( Map< String, Object > schedulingDate ) {
        this.schedulingDate = schedulingDate;
    }
}
