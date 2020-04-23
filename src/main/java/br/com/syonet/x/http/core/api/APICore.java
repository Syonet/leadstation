package br.com.syonet.x.http.core.api;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.syonet.x.http.core.API;
import br.com.syonet.x.http.core.TLSSocketFactory;
import br.com.syonet.x.util.gson.DateSerializer;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APICore extends API {
    @SuppressWarnings("deprecation")
	public static <R> R create ( Class< R > retrofitClass, 
    		int timeout, 
    		String baseUrl, 
    		String token,
    		boolean useSsLSocketFactory) {
    	Gson gson = new GsonBuilder()
                .registerTypeAdapter( Date.class, new DateSerializer() )
                .serializeNulls()
                .create();

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl( baseUrl )
                .addConverterFactory( GsonConverterFactory.create( gson ) );

        Interceptor languageInterceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept ( Chain chain ) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader( "Accept-Language", Locale.getDefault().toString().replace( "_", "-" ) )
                        .build();
                return chain.proceed( request );
            }
        };

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor( languageInterceptor );

        if ( timeout > 0 ) {
            httpClient.readTimeout( timeout, TimeUnit.MILLISECONDS );
            httpClient.writeTimeout( timeout, TimeUnit.MILLISECONDS );
        }

        if ( token != null ) {
            Interceptor authorizationInterceptor = new Interceptor() {
                @Override
                public okhttp3.Response intercept ( Chain chain ) throws IOException {
                    Request request = chain.request().newBuilder()
                            .addHeader( "Authorization", token )
                            .build();
                    return chain.proceed( request );
                }
            };
            httpClient.addInterceptor( authorizationInterceptor );
        }
		if ( useSsLSocketFactory ) {
		      try {
		          httpClient.sslSocketFactory( new TLSSocketFactory() );
		      } catch ( Exception e ) {
		      }
		}

        retrofitBuilder.client( httpClient.build() );

        Retrofit retrofit = retrofitBuilder.build();

        return (R) retrofit.create( retrofitClass );
    }
}
