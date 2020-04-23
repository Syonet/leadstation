package br.com.syonet.x.model.sms;

import java.io.Serializable;
import java.util.UUID;

import br.com.syonet.x.model.customer.Customer;

public class Sms implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private String message;
    private String phone;
    @SmsStatus
    private String status;
    private UUID opportunityId;
    private Customer customer;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone ( String phone ) {
        this.phone = phone;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public UUID getOpportunityId () {
        return opportunityId;
    }

    public void setOpportunityId ( UUID opportunityId ) {
        this.opportunityId = opportunityId;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }
}
