package br.com.syonet.x.model.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

import br.com.syonet.x.model.address.Address;
import br.com.syonet.x.model.integration.IntegrationChannel;

public class Customer implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private String name;
    @CustomerType
    private String type;
    private String avatar;
    private String notes;
    private Customer company;

    private Map< String, Object > fields;
    private HashSet< String > tags;
    private ArrayList< Address > addresses;

    @IntegrationChannel
    private String integrationChannel;
    private Map< String, Object > integrationFields;
    private UUID leadId;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public @CustomerType String getType () {
        return type;
    }

    public void setType ( @CustomerType String type ) {
        this.type = type;
    }

    public String getAvatar () {
        return avatar;
    }

    public void setAvatar ( String avatar ) {
        this.avatar = avatar;
    }

    public String getNotes () {
        return notes;
    }

    public void setNotes ( String notes ) {
        this.notes = notes;
    }

    public Customer getCompany () {
        return company;
    }

    public void setCompany ( Customer company ) {
        this.company = company;
    }

    public Map< String, Object > getFields () {
        return fields;
    }

    public void setFields ( Map< String, Object > fields ) {
        this.fields = fields;
    }

    public HashSet< String > getTags () {
        return tags;
    }

    public void setTags ( HashSet< String > tags ) {
        this.tags = tags;
    }

    public ArrayList< Address > getAddresses () {
        return addresses;
    }

    public void setAddresses ( ArrayList< Address > addresses ) {
        this.addresses = addresses;
    }

    public @IntegrationChannel String getIntegrationChannel () {
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
