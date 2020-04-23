package br.com.syonet.x.model.lead;

import java.util.UUID;

import com.google.gson.JsonObject;

public class LeadPatch {
    private JsonObject body;

    private LeadPatch ( JsonObject body ) {
        this.body = body;
    }

    public JsonObject getBody () {
        return body;
    }

    public static class Builder {
        private JsonObject builderBody = new JsonObject();

        public Builder setStatus ( @LeadStatus String status ) {
            builderBody.addProperty( "status", status );
            return this;
        }

        public Builder setOpportunityId ( UUID opportunityId ) {
            JsonObject object = new JsonObject();
            object.addProperty( "id", opportunityId.toString() );
            builderBody.add( "opportunity", object );
            return this;
        }

        public Builder setCustomerId ( UUID customerId ) {
            builderBody.addProperty( "customerId", customerId.toString() );
            return this;
        }

        public LeadPatch build () {
            return new LeadPatch( builderBody );
        }
    }
}
