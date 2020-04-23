package br.com.syonet.x.http.core.api.opportunity;

import static br.com.syonet.x.http.core.API.executeCall;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.opportunity.OpportunityFile;
import br.com.syonet.x.util.DirUtils;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public class OpportunityFileAPI {
	private final OpportunityFileAPICalls api;
	private DirUtils dirUtils;
    public OpportunityFileAPI(OpportunityFileAPICalls api, DirUtils dirUtils) {
		this.api = api;
		this.dirUtils = dirUtils;
	}

	public ArrayList< OpportunityFile > getFiles ( UUID opportunityId ) throws APICoreException, AppException {
        return executeCall( this.api.getFiles( opportunityId ) ).getContent();
    }

    public OpportunityFile saveFile ( UUID opportunityId, String fileName, File file )
            throws APICoreException, AppException {
        MultipartBody.Part filePart = MultipartBody.Part.createFormData( "file", fileName,
                RequestBody.create( MediaType.parse( dirUtils.getFileType( file ) ), file ) );

        return executeCall( this.api.saveFile( opportunityId, fileName, filePart.body() ) )
                .getContent();
    }

    public void deleteFile ( UUID id ) throws APICoreException, AppException {
        executeCall( this.api.deleteFile( id ) );
    }

    public String downloadFile ( OpportunityFile opportunityFile ) throws APICoreException, AppException {
        ResponseBody body = executeCall( this.api.downloadFile( opportunityFile.getId() ) ).getContent();

        InputStream is = body.byteStream();
        File imgFile = dirUtils.getFile( opportunityFile );

        dirUtils.copyFile( is, imgFile );

        try {
            is.close();
        } catch ( Exception e ) {
        }

        return imgFile.getAbsolutePath();
    }
}
