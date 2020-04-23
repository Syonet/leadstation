package br.com.syonet.x.model.subscription;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import br.com.syonet.x.model.segment.Segment;

public class Subscription implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private String currency;
    private ArrayList< SubscriptionIntegration > integrations;
    private Segment segment;
    private Date expireAt;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCurrency () {
        return currency;
    }

    public void setCurrency ( String currency ) {
        this.currency = currency;
    }

    public ArrayList< SubscriptionIntegration > getIntegrations () {
        return integrations;
    }

    public void setIntegrations ( ArrayList< SubscriptionIntegration > integrations ) {
        this.integrations = integrations;
    }

    public Segment getSegment () {
        return segment;
    }

    public void setSegment ( Segment segment ) {
        this.segment = segment;
    }

    public Date getExpireAt () {
        return expireAt;
    }

    public void setExpireAt ( Date expireAt ) {
        this.expireAt = expireAt;
    }
}
