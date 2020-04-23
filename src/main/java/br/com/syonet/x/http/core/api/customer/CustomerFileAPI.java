package br.com.syonet.x.http.core.api.customer;

import static br.com.syonet.x.http.core.API.executeCall;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.customer.CustomerFile;
import br.com.syonet.x.util.DirUtils;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public class CustomerFileAPI {
    private CustomerFileAPICalls api;
	private DirUtils dirUtils;

	public CustomerFileAPI (CustomerFileAPICalls api, DirUtils dirUtils) {
    	this.api = api;
    	this.dirUtils = dirUtils;
     }

    public ArrayList< CustomerFile > getFiles ( UUID customerId ) throws APICoreException, AppException {
        return executeCall( this.api.getFiles( customerId ) ).getContent();
    }

    public CustomerFile saveFile ( UUID customerId, String fileName, File file )
            throws APICoreException, AppException {
        MultipartBody.Part filePart = MultipartBody.Part.createFormData( "file", fileName,
                RequestBody.create( MediaType.parse( dirUtils.getFileType( file ) ), file ) );

        return executeCall( this.api.saveFile( customerId, fileName, filePart.body() ) ).getContent();
    }

    public void deleteFile ( UUID id ) throws APICoreException, AppException {
        executeCall( this.api.deleteFile( id ) );
    }

    public String downloadFile ( CustomerFile customerFile ) throws APICoreException, AppException {
        ResponseBody body = executeCall( this.api.downloadFile( customerFile.getId() ) ).getContent();

        InputStream is = body.byteStream();
        File imgFile = dirUtils.getFile( customerFile );

        dirUtils.copyFile( is, imgFile );

        try {
            is.close();
        } catch ( Exception e ) {
        }

        return imgFile.getAbsolutePath();
    }
}
