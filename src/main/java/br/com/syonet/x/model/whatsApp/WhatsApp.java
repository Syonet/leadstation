package br.com.syonet.x.model.whatsApp;

import java.util.UUID;

public class WhatsApp {
    private UUID opportunityId;
    private String opportunityTitle;
    private String phone;

    public WhatsApp ( UUID opportunityId, String phone ) {
        this.opportunityId = opportunityId;
        this.phone = phone;
    }

    public UUID getOpportunityId () {
        return opportunityId;
    }

    public void setOpportunityId ( UUID opportunityId ) {
        this.opportunityId = opportunityId;
    }

    public String getOpportunityTitle () {
        return opportunityTitle;
    }

    public void setOpportunityTitle ( String opportunityTitle ) {
        this.opportunityTitle = opportunityTitle;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }
}
