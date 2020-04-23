package br.com.syonet.x.model.scheduling;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.opportunity.scheduling.OpportunitySchedulingType;
import br.com.syonet.x.model.user.User;

public class Scheduling implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private User user;
    private Customer customer;
    private Opportunity opportunity;
    @SchedulingStatus
    private String status;
    private Date startDate;
    private Date endDate;
    private boolean allDay;
    private OpportunitySchedulingType opportunitySchedulingType;
    private String title;
    private String description;
    private String color;
    private Date notifyAt;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }

    public Opportunity getOpportunity () {
        return opportunity;
    }

    public void setOpportunity ( Opportunity opportunity ) {
        this.opportunity = opportunity;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public Date getStartDate () {
        return startDate;
    }

    public void setStartDate ( Date startDate ) {
        this.startDate = startDate;
    }

    public Date getEndDate () {
        return endDate;
    }

    public void setEndDate ( Date endDate ) {
        this.endDate = endDate;
    }

    public boolean isAllDay () {
        return allDay;
    }

    public void setAllDay ( boolean allDay ) {
        this.allDay = allDay;
    }

    public OpportunitySchedulingType getOpportunitySchedulingType () {
        return opportunitySchedulingType;
    }

    public void setOpportunitySchedulingType ( OpportunitySchedulingType opportunitySchedulingType ) {
        this.opportunitySchedulingType = opportunitySchedulingType;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public Date getNotifyAt () {
        return notifyAt;
    }

    public void setNotifyAt ( Date notifyAt ) {
        this.notifyAt = notifyAt;
    }
}
