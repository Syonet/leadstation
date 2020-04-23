package br.com.syonet.x.model.user;

import java.io.Serializable;

import br.com.syonet.x.model.user.preference.CustomerUserPreference;
import br.com.syonet.x.model.user.preference.OpportunityUserPreference;

public class UserPreferences implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomerUserPreference company;
    private CustomerUserPreference person;
    private OpportunityUserPreference opportunity;
    private Object tour;

    public CustomerUserPreference getCompany () {
        return company;
    }

    public void setCompany ( CustomerUserPreference company ) {
        this.company = company;
    }

    public CustomerUserPreference getPerson () {
        return person;
    }

    public void setPerson ( CustomerUserPreference person ) {
        this.person = person;
    }

    public OpportunityUserPreference getOpportunity () {
        return opportunity;
    }

    public void setOpportunity ( OpportunityUserPreference opportunity ) {
        this.opportunity = opportunity;
    }

    public Object getTour () {
        return tour;
    }

    public void setTour ( Object tour ) {
        this.tour = tour;
    }
}
