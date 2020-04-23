package br.com.syonet.x.http.core.api.form;

import java.util.ArrayList;

import br.com.syonet.x.model.form.Field;
import br.com.syonet.x.model.form.FormType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FieldAPICalls {
    @GET( "forms/{formType}/fields" )
    Call< ArrayList< Field > > getFields ( @Path( "formType" ) @FormType String formType );

    @GET( "forms/{formType}/fields/filters" )
    Call< ArrayList< Field > > getFilterFields ( @Path( "formType" ) @FormType String formType );
}
