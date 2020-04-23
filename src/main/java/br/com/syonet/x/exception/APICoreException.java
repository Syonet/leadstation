package br.com.syonet.x.exception;

import br.com.syonet.x.model.APIError;

public class APICoreException extends Exception {
    private APIError apiError;

    public APICoreException ( APIError apiError ) {
        super( apiError.getError() + ": " + apiError.getMessage() );
        this.apiError = apiError;
    }

    public APIError getApiError () {
        return apiError;
    }
}
