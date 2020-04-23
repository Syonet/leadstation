package br.com.syonet.x.model.segment;

import java.io.Serializable;
import java.util.ArrayList;

public class SegmentOptions implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList< String > brandTypes;
    private ArrayList< String > brands;

    public ArrayList< String > getBrandTypes () {
        return brandTypes;
    }

    public void setBrandTypes ( ArrayList< String > brandTypes ) {
        this.brandTypes = brandTypes;
    }

    public ArrayList< String > getBrands () {
        return brands;
    }

    public void setBrands ( ArrayList< String > brands ) {
        this.brands = brands;
    }
}
