package br.com.syonet.x.http.core.api.user;

import java.util.ArrayList;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import br.com.syonet.x.model.user.User;
import br.com.syonet.x.model.user.UserStatistics;
import br.com.syonet.x.model.user.mobile.UserMobile;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface UserAPICalls {
    @GET( "users/me" )
    Call< User > getCurrentUser ();

    @GET( "users" )
    Call< ArrayList< User > > getUsers ();

    @PATCH( "users/me" )
    Call< User > saveUser ( @Body JsonObject body );

    @PUT( "users/me/avatar" )
    Call< User > uploadAvatar ( @Body RequestBody body );

    @DELETE( "users/me/avatar" )
    Call< User > deleteAvatar ();

    @GET( "users/me/mobiles" )
    Call< ArrayList< UserMobile > > getUserMobiles ();

    @PUT( "users/me/mobiles" )
    Call< Void > saveUserMobiles ( @Body JsonArray body );

    @GET( "users/me/statistics" )
    Call< UserStatistics > getStatistics ( @Query( "usersId" ) Set< Integer > usersId );
}
