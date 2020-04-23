package br.com.syonet.x.http.core.api.customer;

import java.util.List;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.customer.CustomerStatistics;
import br.com.syonet.x.model.email.Email;
import br.com.syonet.x.model.phoneCall.PhoneCall;
import br.com.syonet.x.model.sms.Sms;
import br.com.syonet.x.model.whatsApp.WhatsApp;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CustomerAPICalls {
    @GET( "customers" )
    Call< List< Customer > > getCustomers ( @Query( "type" ) String type, @Query( "page" ) int page );

    @GET( "customers/{id}" )
    Call< Customer > getCustomer ( @Path( "id" ) UUID id );

    @GET( "customers/search" )
    Call< List< Customer > > search ( @Query( "query" ) String name, @Query( "type" ) String type );

    @POST( "customers" )
    Call< Customer > createCustomer ( @Body JsonObject body );

    @PATCH( "customers/{id}" )
    Call< Customer > patchCustomer ( @Path( "id" ) UUID id, @Body JsonObject body );

    @PUT( "customers/{id}" )
    Call< Customer > putCustomer ( @Path( "id" ) UUID id, @Body JsonObject body );

    @GET( "customers/{id}/persons" )
    Call< List< Customer > > getPersons ( @Path( "id" ) UUID id );

    @POST( "customers/{id}/comments" )
    Call< Void > createComment ( @Path( "id" ) UUID customerId, @Body JsonObject body );

    @PUT( "customers/{id}/avatar" )
    Call< Customer > uploadAvatar ( @Path( "id" ) UUID id, @Body RequestBody body );

    @DELETE( "customers/{id}/avatar" )
    Call< Customer > deleteAvatar ( @Path( "id" ) UUID id );

    @GET( "customers/{id}/following" )
    Call< Boolean > isFollowing ( @Path( "id" ) UUID id );

    @PUT( "customers/{id}/following" )
    Call< Void > follow ( @Path( "id" ) UUID id );

    @DELETE( "customers/{id}/following" )
    Call< Void > unfollow ( @Path( "id" ) UUID id );

    @POST( "customers/{id}/phonecalls" )
    Call< PhoneCall > registerPhoneCall ( @Path( "id" ) UUID id, @Body PhoneCall phoneCall );

    @POST( "customers/{id}/whatsapps" )
    Call< WhatsApp > registerWhatsApp ( @Path( "id" ) UUID id, @Body WhatsApp whatsApp );

    @POST( "customers/{id}/sms" )
    Call< Sms > sendSms ( @Path( "id" ) UUID id, @Body Sms sms );

    @POST( "customers/{id}/emails" )
    Call< Email > sendEmail ( @Path( "id" ) UUID id, @Body MultipartBody body );

    @GET( "customers/{id}/statistics" )
    Call< CustomerStatistics > getStatistics ( @Path( "id" ) UUID id );
}
