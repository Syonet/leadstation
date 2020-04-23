package br.com.syonet.x.model.lead;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.source.Source;

public class Lead implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    @LeadStatus
    private String status;
    @LeadPortal
    private String portal;
    private Source source;
    private String to;
    private String from;
    private String subject;
    private String body;
    private UUID customerId;
    private Opportunity opportunity;
    private Date createdAt;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public String getPortal () {
        return portal;
    }

    public void setPortal ( String portal ) {
        this.portal = portal;
    }

    public Source getSource () {
        return source;
    }

    public void setSource ( Source source ) {
        this.source = source;
    }

    public String getTo () {
        return to;
    }

    public void setTo ( String to ) {
        this.to = to;
    }

    public String getFrom () {
        return from;
    }

    public void setFrom ( String from ) {
        this.from = from;
    }

    public String getSubject () {
        return subject;
    }

    public void setSubject ( String subject ) {
        this.subject = subject;
    }

    public String getBody () {
        return body;
    }

    public void setBody ( String body ) {
        this.body = body;
    }

    public UUID getCustomerId () {
        return customerId;
    }

    public void setCustomerId ( UUID customerId ) {
        this.customerId = customerId;
    }

    public Opportunity getOpportunity () {
        return opportunity;
    }

    public void setOpportunity ( Opportunity opportunity ) {
        this.opportunity = opportunity;
    }

    public Date getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt ( Date createdAt ) {
        this.createdAt = createdAt;
    }
}
