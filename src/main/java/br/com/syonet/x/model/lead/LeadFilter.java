package br.com.syonet.x.model.lead;

import java.io.Serializable;

public class LeadFilter implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sourceId;
    private String to;
    private String from;

    public Integer getSourceId () {
        return sourceId;
    }

    public void setSourceId ( Integer sourceId ) {
        this.sourceId = sourceId;
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
}
