package br.com.syonet.x.model.opportunity.scheduling;

import java.io.Serializable;

public class OpportunitySchedulingType implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private String color;
    private boolean forward;

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

    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public boolean isForward () {
        return forward;
    }

    public void setForward ( boolean forward ) {
        this.forward = forward;
    }
}