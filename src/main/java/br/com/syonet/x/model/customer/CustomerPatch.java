package br.com.syonet.x.model.customer;

import java.util.Set;
import java.util.UUID;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CustomerPatch {
    private JsonObject body;

    private CustomerPatch ( JsonObject body ) {
        this.body = body;
    }

    public JsonObject getBody () {
        return body;
    }

    public static class Builder {
        private JsonObject builderBody = new JsonObject();

        public Builder setNotes ( String notes ) {
            builderBody.addProperty( "notes", notes );
            return this;
        }

        public Builder setTags ( Set< String > tags ) {
            JsonArray jsonArray = new JsonArray();
            for ( String tag : tags ) {
                jsonArray.add( tag );
            }

            builderBody.add( "tags", jsonArray );
            return this;
        }

        public Builder setCompanyId ( UUID companyId ) {
            JsonObject object = null;

            if ( companyId != null ) {
                object = new JsonObject();
                object.addProperty( "id", companyId.toString() );
            }

            builderBody.add( "company", object );
            return this;
        }

        public CustomerPatch build () {
            return new CustomerPatch( builderBody );
        }
    }
}