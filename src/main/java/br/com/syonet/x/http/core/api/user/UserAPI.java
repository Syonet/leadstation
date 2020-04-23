package br.com.syonet.x.http.core.api.user;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import static br.com.syonet.x.http.core.API.executeCall;
import br.com.syonet.x.model.user.User;
import br.com.syonet.x.model.user.UserPatch;
import br.com.syonet.x.model.user.UserStatistics;
import br.com.syonet.x.model.user.mobile.UserMobile;
import br.com.syonet.x.util.gson.GsonUtils;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class UserAPI {
	private final UserAPICalls api;

	public UserAPI ( UserAPICalls api ) {
    	this.api = api;
    }

    public User getCurrentUser () throws APICoreException, AppException {
        return executeCall( api.getCurrentUser() ).getContent();
    }

    public ArrayList< User > getUsers () throws APICoreException, AppException {
        return executeCall( api.getUsers() ).getContent();
    }

    public User saveUser ( UserPatch userPatch ) throws APICoreException, AppException {
        return executeCall( api.saveUser( userPatch.getBody() ) ).getContent();
    }

    public User uploadAvatar ( File file ) throws APICoreException, AppException {
        MultipartBody.Part filePart = MultipartBody.Part.createFormData( "file",
                file.getName(), RequestBody.create( MediaType.parse( "image" ), file ) );

        return executeCall( api.uploadAvatar( filePart.body() ) ).getContent();
    }

    public User deleteAvatar () throws APICoreException, AppException {
        return executeCall( api.deleteAvatar() ).getContent();
    }

    public ArrayList< UserMobile > getUserMobiles () throws APICoreException, AppException {
        return executeCall( api.getUserMobiles() ).getContent();
    }

    public void saveUserMobiles ( ArrayList< UserMobile > userMobiles ) throws APICoreException, AppException {
        executeCall( api.saveUserMobiles( GsonUtils.toJsonArray( userMobiles ) ) );
    }

    public UserStatistics getUserStatistics ( Set< Integer > usersId ) throws APICoreException, AppException {
        return executeCall( api.getStatistics( usersId ) ).getContent();
    }
}
