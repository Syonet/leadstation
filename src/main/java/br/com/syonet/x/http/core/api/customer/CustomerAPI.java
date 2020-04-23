package br.com.syonet.x.http.core.api.customer;

import static br.com.syonet.x.http.core.API.executeCall;

import java.io.File;
import java.util.List;
import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.http.core.StringUtils;
import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.customer.CustomerPatch;
import br.com.syonet.x.model.customer.CustomerStatistics;
import br.com.syonet.x.model.customer.CustomerType;
import br.com.syonet.x.model.email.Email;
import br.com.syonet.x.model.phoneCall.PhoneCall;
import br.com.syonet.x.model.sms.Sms;
import br.com.syonet.x.model.whatsApp.WhatsApp;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public class CustomerAPI {
    private CustomerAPICalls api;

	public CustomerAPI (CustomerAPICalls api ) {
        this.api = api;
    }

    public APIResponse< List< Customer > > getCustomers ( @CustomerType String type, int page ) throws APICoreException,
            AppException {
        return executeCall( this.api.getCustomers( type, page ) );
    }

    public Customer getCustomer ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.getCustomer( id ) ).getContent();
    }

    public List< Customer > search ( String name, @CustomerType String customerType ) throws APICoreException,
            AppException {
        return executeCall( this.api.search( name, customerType ) ).getContent();
    }

    public Customer createCustomer ( JsonObject customerFields, @CustomerType String customerType )
            throws APICoreException, AppException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add( "fields", customerFields );
        jsonObject.addProperty( "type", customerType );

        return executeCall( this.api.createCustomer( jsonObject ) ).getContent();
    }

    public Customer patchCustomer ( UUID customerId, CustomerPatch customerPatch ) throws APICoreException,
            AppException {
        return executeCall( this.api.patchCustomer( customerId, customerPatch.getBody() ) ).getContent();
    }

    public Customer putCustomer ( UUID customerId, JsonObject customerFields ) throws APICoreException, AppException {
        return executeCall( this.api.putCustomer( customerId, customerFields ) ).getContent();
    }

    public List< Customer > getPersons ( UUID companyId ) throws APICoreException, AppException {
        return executeCall( this.api.getPersons( companyId ) ).getContent();
    }

    public void createComment ( UUID customerId, String comment ) throws APICoreException, AppException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty( "comment", comment );

        executeCall( this.api.createComment( customerId, jsonObject ) );
    }

    public Customer uploadAvatar ( UUID customerId, File file ) throws APICoreException, AppException {
        MultipartBody.Part filePart = MultipartBody.Part.createFormData( "file",
                file.getName(), RequestBody.create( MediaType.parse( "image" ), file ) );

        return executeCall( this.api.uploadAvatar( customerId, filePart.body() ) ).getContent();
    }

    public Customer deleteAvatar ( UUID customerId ) throws APICoreException, AppException {
        return executeCall( this.api.deleteAvatar( customerId ) ).getContent();
    }

    public boolean isFollowing ( UUID customerId ) throws APICoreException, AppException {
        return executeCall( this.api.isFollowing( customerId ) ).getContent();
    }

    public void follow ( UUID customerId ) throws APICoreException, AppException {
        executeCall( this.api.follow( customerId ) );
    }

    public void unfollow ( UUID customerId ) throws APICoreException, AppException {
        executeCall( this.api.unfollow( customerId ) );
    }

    public PhoneCall registerPhoneCall ( UUID customerId, PhoneCall phoneCall ) throws APICoreException, AppException {
        return executeCall( this.api.registerPhoneCall( customerId, phoneCall ) ).getContent();
    }

    public WhatsApp registerWhatsApp ( UUID customerId, WhatsApp whatsApp ) throws APICoreException, AppException {
        return executeCall( this.api.registerWhatsApp( customerId, whatsApp ) ).getContent();
    }

    public Sms sendSms ( UUID customerId, Sms sms ) throws APICoreException, AppException {
        return executeCall( this.api.sendSms( customerId, sms ) ).getContent();
    }

    public Email sendEmail ( UUID customerId, Email email ) throws APICoreException, AppException {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType( MediaType.parse( "multipart/form-data" ) );

        builder.addFormDataPart( "customerId", customerId.toString() );
        builder.addFormDataPart( "to", StringUtils.join( ",", email.getTo() ) );
        builder.addFormDataPart( "body", email.getBody() );
        builder.addFormDataPart( "subject", email.getSubject() );

        if ( email.getOpportunityId() != null ) {
            builder.addFormDataPart( "opportunityId", email.getOpportunityId().toString() );
        }

        return executeCall( this.api.sendEmail( customerId, builder.build() ) ).getContent();
    }

    public CustomerStatistics getStatistics ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.getStatistics( id ) ).getContent();
    }
}
