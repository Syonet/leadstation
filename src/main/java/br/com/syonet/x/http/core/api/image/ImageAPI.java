package br.com.syonet.x.http.core.api.image;

import java.io.File;
import java.io.InputStream;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.API;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

public class ImageAPI extends API {
    //O retrofit exije uma url de base para criar a interface
    private static final String BASE_URL = "http://localhost";

    private ImageAPICalls retrofitInterface;

    public ImageAPI () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( BASE_URL )
                .build();
        retrofitInterface = retrofit.create( ImageAPICalls.class );
    }

    public String downloadImage ( String imageUrl ) throws APICoreException, AppException {
        ResponseBody body = executeCall( retrofitInterface.downloadImage( imageUrl ) ).getContent();

        InputStream is = body.byteStream();
        File imgFile = DirUtils.getImageFile( imageUrl );

        DirUtils.copyFile( is, imgFile );

        try {
            is.close();
        } catch ( Exception e ) {
        }

        return imgFile.getAbsolutePath();
    }

}
