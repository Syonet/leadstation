package br.com.syonet.x.http.core.api.product;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;
import java.util.List;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.product.Product;

public class ProductAPI {
    private ProductAPICalls api;

	public ProductAPI (ProductAPICalls api ) {
        this.api = api;
    }

    public ArrayList< Product > getProducts () throws APICoreException, AppException {
        return executeCall( this.api.getProducts() ).getContent();
    }

    public List< Product > search ( String description ) throws APICoreException, AppException {
        return executeCall( this.api.search( description ) ).getContent();
    }
}
