package br.com.syonet.x.model.notification;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.scheduling.Scheduling;
import br.com.syonet.x.model.sms.SmsResponse;
import br.com.syonet.x.model.user.User;

public class Notification implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    @NotificationType
    private String type;
    private Date date;
    private boolean read;

    private Opportunity opportunity;
    private Scheduling scheduling;
    private SmsResponse smsResponse;
    private User createdBy;
    private Customer customer;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public Date getDate () {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }

    public boolean isRead () {
        return read;
    }

    public void setRead ( boolean read ) {
        this.read = read;
    }

    public Opportunity getOpportunity () {
        return opportunity;
    }

    public void setOpportunity ( Opportunity opportunity ) {
        this.opportunity = opportunity;
    }

    public Scheduling getScheduling () {
        return scheduling;
    }

    public void setScheduling ( Scheduling scheduling ) {
        this.scheduling = scheduling;
    }

    public SmsResponse getSmsResponse () {
        return smsResponse;
    }

    public void setSmsResponse ( SmsResponse smsResponse ) {
        this.smsResponse = smsResponse;
    }

    public User getCreatedBy () {
        return createdBy;
    }

    public void setCreatedBy ( User createdBy ) {
        this.createdBy = createdBy;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }
}
