package br.com.syonet.x.http.core;

import java.util.List;
import java.util.Map;

public class APIResponse< T > {
    private T content;
    private Map< String, List< String > > headers;

    public APIResponse ( T content ) {
        this.content = content;
    }

    public T getContent () {
        return content;
    }

    public void setContent ( T content ) {
        this.content = content;
    }

    public Map< String, List< String > > getHeaders () {
        return headers;
    }

    public void setHeaders ( Map< String, List< String > > headers ) {
        this.headers = headers;
    }
}
