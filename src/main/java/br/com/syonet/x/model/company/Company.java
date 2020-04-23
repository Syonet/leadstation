package br.com.syonet.x.model.company;

import java.io.Serializable;

public class Company implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private String tradingName;

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

    public String getTradingName () {
        return tradingName;
    }

    public void setTradingName ( String tradingName ) {
        this.tradingName = tradingName;
    }
}
