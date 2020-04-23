package br.com.syonet.x.model.subscription;

import java.io.Serializable;

public class SubscriptionIntegration implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SubscriptionIntegrationType
    private String integration;
    private Boolean active;

    public String getIntegration () {
        return integration;
    }

    public void setIntegration ( String integration ) {
        this.integration = integration;
    }

    public Boolean getActive () {
        return active;
    }

    public void setActive ( Boolean active ) {
        this.active = active;
    }
}
