package br.com.syonet.x.http.core.api.image;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ImageAPICalls {
    @GET
    Call< ResponseBody > downloadImage ( @Url String url );
}
