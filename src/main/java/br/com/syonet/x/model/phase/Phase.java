package br.com.syonet.x.model.phase;

import java.io.Serializable;
import java.util.ArrayList;

public class Phase implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private int funnelId;
    private int previousPhaseId;
    private int days;
    private ArrayList< PhaseTrigger > triggers;

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

    public int getFunnelId () {
        return funnelId;
    }

    public void setFunnelId ( int funnelId ) {
        this.funnelId = funnelId;
    }

    public int getPreviousPhaseId () {
        return previousPhaseId;
    }

    public void setPreviousPhaseId ( int previousPhaseId ) {
        this.previousPhaseId = previousPhaseId;
    }

    public int getDays () {
        return days;
    }

    public void setDays ( int days ) {
        this.days = days;
    }

    public ArrayList< PhaseTrigger > getTriggers () {
        return triggers;
    }

    public void setTriggers ( ArrayList< PhaseTrigger > triggers ) {
        this.triggers = triggers;
    }
}
