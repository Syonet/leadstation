package br.com.syonet.x.model.email;

import java.io.Serializable;
import java.util.HashSet;
import java.util.UUID;

public class Email implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private UUID parentId;
    private UUID customerId;
    private UUID opportunityId;
    private String customerName;
    private String opportunityTitle;
    private String from;
    private HashSet< String > to;
    private String subject;
    private String body;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public UUID getParentId () {
        return parentId;
    }

    public void setParentId ( UUID parentId ) {
        this.parentId = parentId;
    }

    public UUID getCustomerId () {
        return customerId;
    }

    public void setCustomerId ( UUID customerId ) {
        this.customerId = customerId;
    }

    public UUID getOpportunityId () {
        return opportunityId;
    }

    public void setOpportunityId ( UUID opportunityId ) {
        this.opportunityId = opportunityId;
    }

    public String getCustomerName () {
        return customerName;
    }

    public void setCustomerName ( String customerName ) {
        this.customerName = customerName;
    }

    public String getOpportunityTitle () {
        return opportunityTitle;
    }

    public void setOpportunityTitle ( String opportunityTitle ) {
        this.opportunityTitle = opportunityTitle;
    }

    public String getFrom () {
        return from;
    }

    public void setFrom ( String from ) {
        this.from = from;
    }

    public HashSet< String > getTo () {
        return to;
    }

    public void setTo ( HashSet< String > to ) {
        this.to = to;
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
}