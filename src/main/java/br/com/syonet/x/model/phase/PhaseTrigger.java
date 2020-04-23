package br.com.syonet.x.model.phase;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.syonet.x.model.template.Template;
import br.com.syonet.x.model.user.User;

public class PhaseTrigger implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private Template template;
    private boolean automatic;
    private boolean sendCustomer;
    private ArrayList< User > users;
    private boolean sent;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public Template getTemplate () {
        return template;
    }

    public void setTemplate ( Template template ) {
        this.template = template;
    }

    public boolean isAutomatic () {
        return automatic;
    }

    public void setAutomatic ( boolean automatic ) {
        this.automatic = automatic;
    }

    public boolean isSendCustomer () {
        return sendCustomer;
    }

    public void setSendCustomer ( boolean sendCustomer ) {
        this.sendCustomer = sendCustomer;
    }

    public ArrayList< User > getUsers () {
        return users;
    }

    public void setUsers ( ArrayList< User > users ) {
        this.users = users;
    }

    public boolean isSent () {
        return sent;
    }

    public void setSent ( boolean sent ) {
        this.sent = sent;
    }
}
