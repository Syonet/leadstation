package br.com.syonet.x.model;

import java.io.Serializable;

public class APIError implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
    private String error;
    private String message;

    public int getStatus () {
        return status;
    }

    public void setStatus ( int status ) {
        this.status = status;
    }

    public String getError () {
        return error;
    }

    public void setError ( String error ) {
        this.error = error;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }
}
