package br.com.syonet.x.http.core.api.template;

import java.util.List;

import br.com.syonet.x.model.template.Template;
import retrofit2.Call;
import retrofit2.http.GET;


public interface TemplateAPICalls {
    @GET( "api/v1/templates" )
    Call< List< Template > > getTemplates ();
}
