package br.com.syonet.x.model.customer;

import java.io.Serializable;
import java.util.Date;

public class CustomerStatistics implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float totalTrading;
    private float totalPurchased;
    private Date lastContact;
    private Date lastPurchase;

    public float getTotalTrading () {
        return totalTrading;
    }

    public void setTotalTrading ( float totalTrading ) {
        this.totalTrading = totalTrading;
    }

    public float getTotalPurchased () {
        return totalPurchased;
    }

    public void setTotalPurchased ( float totalPurchased ) {
        this.totalPurchased = totalPurchased;
    }

    public Date getLastContact () {
        return lastContact;
    }

    public void setLastContact ( Date lastContact ) {
        this.lastContact = lastContact;
    }

    public Date getLastPurchase () {
        return lastPurchase;
    }

    public void setLastPurchase ( Date lastPurchase ) {
        this.lastPurchase = lastPurchase;
    }
}
