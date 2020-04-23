package br.com.syonet.x.model.opportunity;

import java.util.UUID;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.funnel.Funnel;
import br.com.syonet.x.model.lossReason.LossReason;
import br.com.syonet.x.model.phase.Phase;

public class OpportunityPatch {
    private JsonObject body;

    private OpportunityPatch ( JsonObject body ) {
        this.body = body;
    }

    public JsonObject getBody () {
        return body;
    }

    public static class Builder {
        private JsonObject builderBody = new JsonObject();

        public Builder setLossReason ( LossReason lossReason ) {
            JsonObject object = new JsonObject();
            object.addProperty( "id", lossReason.getId() );
            builderBody.add( "lossReason", object );
            return this;
        }

        public Builder setLossReasonComplement ( String lossReasonComplement ) {
            builderBody.addProperty( "lossReasonComplement", lossReasonComplement );
            return this;
        }

        public Builder setPhase ( Phase phase ) {
            JsonObject object = new JsonObject();
            object.addProperty( "id", phase.getId() );
            builderBody.add( "phase", object );
            return this;
        }

        public Builder setFunnel ( Funnel funnel ) {
            builderBody.addProperty( "funnelId", funnel.getId() );
            return this;
        }

        public Builder setStatus ( @OpportunityStatus String status ) {
            builderBody.addProperty( "status", status );
            return this;
        }

        public Builder setTemperature ( @OpportunityTemperature String temperature ) {
            builderBody.addProperty( "temperature", temperature );
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

        public Builder setPersonId ( UUID personId ) {
            JsonObject object = null;

            if ( personId != null ) {
                object = new JsonObject();
                object.addProperty( "id", personId.toString() );
            }

            builderBody.add( "person", object );
            return this;
        }

        public OpportunityPatch build () {
            return new OpportunityPatch( builderBody );
        }
    }
}
