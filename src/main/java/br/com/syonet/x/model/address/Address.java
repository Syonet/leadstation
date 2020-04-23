package br.com.syonet.x.model.address;

import java.io.Serializable;

import br.com.syonet.x.model.location.Location;

public class Address implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String placeId;
    private String name;
    @AddressType
    private String type;

    private Location location;

    public String getPlaceId () {
        return placeId;
    }

    public void setPlaceId ( String placeId ) {
        this.placeId = placeId;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public @AddressType String getType () {
        return type;
    }

    public void setType ( @AddressType String type ) {
        this.type = type;
    }

    public Location getLocation () {
        return location;
    }

    public void setLocation ( Location location ) {
        this.location = location;
    }
}
