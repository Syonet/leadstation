package br.com.syonet.x.model.user.mobile;

import java.io.Serializable;

public class UserMobile implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;
    private String device;
    private String locale;

    public UserMobile () {
    }

    public UserMobile ( String token, String device, String locale ) {
        this.token = token;
        this.device = device;
        this.locale = locale;
    }

    public String getToken () {
        return token;
    }

    public void setToken ( String token ) {
        this.token = token;
    }

    public String getDevice () {
        return device;
    }

    public void setDevice ( String device ) {
        this.device = device;
    }

    public String getLocale () {
        return locale;
    }

    public void setLocale ( String locale ) {
        this.locale = locale;
    }
}
