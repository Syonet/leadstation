package br.com.syonet.x.exception;

import br.com.syonet.x.model.AppError;

public class AppException extends Exception {
    private AppError appError;

    public AppException ( AppError appError ) {
        super( appError.getMessage() );
        this.appError = appError;
    }

    public AppError getAppError () {
        return appError;
    }
}
