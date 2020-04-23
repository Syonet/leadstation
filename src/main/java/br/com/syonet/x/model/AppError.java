package br.com.syonet.x.model;

import java.io.Serializable;

public class AppError implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int ERROR_GENERIC = 0;
    public static final int ERROR_CONNECTION_FAILURE = 1;

    private int code;
    private String message;

    public AppError ( int code, String message ) {
        this.code = code;
        this.message = message;
    }

    public int getCode () {
        return code;
    }

    public void setCode ( int code ) {
        this.code = code;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage ( String message ) {
        this.message = message;
    }
}
