package br.com.syonet.x.model.opportunity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.integration.IntegrationChannel;
import br.com.syonet.x.model.lossReason.LossReason;
import br.com.syonet.x.model.phase.Phase;
import br.com.syonet.x.model.user.User;

public class Opportunity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private UUID originId;
    private Customer company;
    private Customer person;
    private User user;
    private String title;
    private float price;
    private LossReason lossReason;
    private String lossReasonComplement;
    private Phase phase;
    private Date closingAt;
    private Date phaseEntryDate;
    private Date nextScheduling;
    private User lastSchedulingUser;
    private Map< String, Object > fields;
    @IntegrationChannel
    private String integrationChannel;
    private Map< String, Object > integrationFields;
    private UUID leadId;

    @OpportunityStatus
    private String status;

    @OpportunityTemperature
    private String temperature;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public UUID getOriginId () {
        return originId;
    }

    public void setOriginId ( UUID originId ) {
        this.originId = originId;
    }

    public Customer getCompany () {
        return company;
    }

    public void setCompany ( Customer company ) {
        this.company = company;
    }

    public Customer getPerson () {
        return person;
    }

    public void setPerson ( Customer person ) {
        this.person = person;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public float getPrice () {
        return price;
    }

    public void setPrice ( float price ) {
        this.price = price;
    }

    public LossReason getLossReason () {
        return lossReason;
    }

    public void setLossReason ( LossReason lossReason ) {
        this.lossReason = lossReason;
    }

    public String getLossReasonComplement () {
        return lossReasonComplement;
    }

    public void setLossReasonComplement ( String lossReasonComplement ) {
        this.lossReasonComplement = lossReasonComplement;
    }

    public Phase getPhase () {
        return phase;
    }

    public void setPhase ( Phase phase ) {
        this.phase = phase;
    }

    public Date getClosingAt () {
        return closingAt;
    }

    public void setClosingAt ( Date closingAt ) {
        this.closingAt = closingAt;
    }

    public Date getPhaseEntryDate () {
        return phaseEntryDate;
    }

    public void setPhaseEntryDate ( Date phaseEntryDate ) {
        this.phaseEntryDate = phaseEntryDate;
    }

    public Map< String, Object > getFields () {
        return fields;
    }

    public void setFields ( Map< String, Object > fields ) {
        this.fields = fields;
    }

    public @OpportunityStatus
    String getStatus () {
        return status;
    }

    public void setStatus ( @OpportunityStatus String status ) {
        this.status = status;
    }

    public @OpportunityTemperature
    String getTemperature () {
        return temperature;
    }

    public void setTemperature ( @OpportunityTemperature String temperature ) {
        this.temperature = temperature;
    }

    public Date getNextScheduling () {
        return nextScheduling;
    }

    public void setNextScheduling ( Date nextScheduling ) {
        this.nextScheduling = nextScheduling;
    }

    public User getLastSchedulingUser () {
        return lastSchedulingUser;
    }

    public void setLastSchedulingUser ( User lastSchedulingUser ) {
        this.lastSchedulingUser = lastSchedulingUser;
    }

    public @IntegrationChannel
    String getIntegrationChannel () {
        return integrationChannel;
    }

    public void setIntegrationChannel ( @IntegrationChannel String integrationChannel ) {
        this.integrationChannel = integrationChannel;
    }

    public Map< String, Object > getIntegrationFields () {
        return integrationFields;
    }

    public void setIntegrationFields ( Map< String, Object > integrationFields ) {
        this.integrationFields = integrationFields;
    }

    public UUID getLeadId () {
        return leadId;
    }

    public void setLeadId ( UUID leadId ) {
        this.leadId = leadId;
    }
}
