package br.com.syonet.x.http.core;

import java.io.IOException;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.APIError;
import br.com.syonet.x.model.AppError;
import br.com.syonet.x.util.DefaultDirUtils;
import br.com.syonet.x.util.DirUtils;
import br.com.syonet.x.util.gson.GsonUtils;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;


public class API {
	public DirUtils DirUtils = new DefaultDirUtils();
	public static < T > APIResponse< T > executeCall ( Call< T > call ) throws APICoreException, AppException {
        APIError apiError;
        try {
            Response< T > response = call.execute();
            if ( response.isSuccessful() ) {
                APIResponse< T > apiResponse = new APIResponse<>( response.body() );

                if ( response.headers() != null ) {
                    apiResponse.setHeaders( response.headers().toMultimap() );
                }

                return apiResponse;
            }

            ResponseBody errorBody = response.errorBody();
            String errorStr = null;
            if ( errorBody != null ) {
                errorStr = errorBody.string();
            }

            if ( errorStr != null && !errorStr.trim().isEmpty() ) {
                apiError = GsonUtils.getGson().fromJson( errorStr, APIError.class );
            } else {
                apiError = new APIError();
                apiError.setStatus( response.code() );
                apiError.setMessage( response.message() );
                apiError.setError( "" );
            }
        } catch ( Exception e ) {
            int appErrorCode = AppError.ERROR_GENERIC;
            if ( e instanceof IOException ) {
                appErrorCode = AppError.ERROR_CONNECTION_FAILURE;
            }
            throw new AppException( new AppError( appErrorCode, e.toString() ) );
        }

        throw new APICoreException( apiError );
    }
}
