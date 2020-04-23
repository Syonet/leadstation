package br.com.syonet.x.model.product;

import java.io.Serializable;
import java.util.UUID;

public class Product implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID id;
    private String code;
    private String description;
    private float price;
    @ProductMeasurementUnit
    private String measurementUnit;

    public UUID getId () {
        return id;
    }

    public void setId ( UUID id ) {
        this.id = id;
    }

    public String getCode () {
        return code;
    }

    public void setCode ( String code ) {
        this.code = code;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription ( String description ) {
        this.description = description;
    }

    public float getPrice () {
        return price;
    }

    public void setPrice ( float price ) {
        this.price = price;
    }

    public @ProductMeasurementUnit String getMeasurementUnit () {
        return measurementUnit;
    }

    public void setMeasurementUnit ( @ProductMeasurementUnit String measurementUnit ) {
        this.measurementUnit = measurementUnit;
    }
}
