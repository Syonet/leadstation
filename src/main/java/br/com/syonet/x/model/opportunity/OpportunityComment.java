package br.com.syonet.x.model.opportunity;

import java.util.UUID;

public class OpportunityComment {
    private UUID id;
    private UUID opportunityId;
    private String comment;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public UUID getOpportunityId () {
        return opportunityId;
    }

    public void setOpportunityId ( UUID opportunityId ) {
        this.opportunityId = opportunityId;
    }

    public String getComment () {
        return comment;
    }

    public void setComment ( String comment ) {
        this.comment = comment;
    }
}
