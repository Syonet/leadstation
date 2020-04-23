package br.com.syonet.x.model.sms;

import java.io.Serializable;
import java.util.UUID;

public class SmsResponse implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private String message;
    private Sms sms;

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

    public Sms getSms () {
        return sms;
    }

    public void setSms ( Sms sms ) {
        this.sms = sms;
    }
}
