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
    @GET( "api/v1/customers" )
    Call< List< Customer > > getCustomers ( @Query( "type" ) String type, @Query( "page" ) int page );

    @GET( "api/v1/customers/{id}" )
    Call< Customer > getCustomer ( @Path( "id" ) UUID id );

    @GET( "api/v1/customers/search" )
    Call< List< Customer > > search ( @Query( "query" ) String name, @Query( "type" ) String type );

    @POST( "api/v1/customers" )
    Call< Customer > createCustomer ( @Body JsonObject body );

    @PATCH( "api/v1/customers/{id}" )
    Call< Customer > patchCustomer ( @Path( "id" ) UUID id, @Body JsonObject body );

    @PUT( "api/v1/customers/{id}" )
    Call< Customer > putCustomer ( @Path( "id" ) UUID id, @Body JsonObject body );

    @GET( "api/v1/customers/{id}/persons" )
    Call< List< Customer > > getPersons ( @Path( "id" ) UUID id );

    @POST( "api/v1/customers/{id}/comments" )
    Call< Void > createComment ( @Path( "id" ) UUID customerId, @Body JsonObject body );

    @PUT( "api/v1/customers/{id}/avatar" )
    Call< Customer > uploadAvatar ( @Path( "id" ) UUID id, @Body RequestBody body );

    @DELETE( "api/v1/customers/{id}/avatar" )
    Call< Customer > deleteAvatar ( @Path( "id" ) UUID id );

    @DELETE( "api/v1/customers/{id}" )
    Call< Void > delete( @Path( "id" ) UUID id );

    @GET( "api/v1/customers/{id}/following" )
    Call< Boolean > isFollowing ( @Path( "id" ) UUID id );

    @PUT( "api/v1/customers/{id}/following" )
    Call< Void > follow ( @Path( "id" ) UUID id );

    @DELETE( "api/v1/customers/{id}/following" )
    Call< Void > unfollow ( @Path( "id" ) UUID id );

    @POST( "api/v1/customers/{id}/phonecalls" )
    Call< PhoneCall > registerPhoneCall ( @Path( "id" ) UUID id, @Body PhoneCall phoneCall );

    @POST( "api/v1/customers/{id}/whatsapps" )
    Call< WhatsApp > registerWhatsApp ( @Path( "id" ) UUID id, @Body WhatsApp whatsApp );

    @POST( "api/v1/customers/{id}/sms" )
    Call< Sms > sendSms ( @Path( "id" ) UUID id, @Body Sms sms );

    @POST( "api/v1/customers/{id}/emails" )
    Call< Email > sendEmail ( @Path( "id" ) UUID id, @Body MultipartBody body );

    @GET( "api/v1/customers/{id}/statistics" )
    Call< CustomerStatistics > getStatistics ( @Path( "id" ) UUID id );
}
