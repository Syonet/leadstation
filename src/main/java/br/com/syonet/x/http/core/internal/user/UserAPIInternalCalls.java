package br.com.syonet.x.http.core.internal.user;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserAPIInternalCalls {
    @POST( "users/{email}/resetpassword" )
    Call< Void > sendPasswordRecoveryEmail ( @Path( "email" ) String email );
}
