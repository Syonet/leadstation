package br.com.syonet.x.model.scheduling;

import java.util.Date;

import com.google.gson.JsonObject;

import br.com.syonet.x.model.customer.Customer;
import br.com.syonet.x.model.opportunity.Opportunity;
import br.com.syonet.x.model.opportunity.scheduling.OpportunitySchedulingType;
import br.com.syonet.x.model.user.User;
import br.com.syonet.x.util.DateISOUtils;

public class SchedulingRequestBody {
    private JsonObject body;

    private SchedulingRequestBody ( JsonObject body ) {
        this.body = body;
    }

    public JsonObject getBody () {
        return body;
    }

    public static class Builder {
        private JsonObject builderBody = new JsonObject();

        public Builder setOpportunityScheduling ( Scheduling scheduling ) {
            return setStartDate( scheduling.getStartDate() )
                    .setEndDate( scheduling.getEndDate() )
                    .setOpportunity( scheduling.getOpportunity() )
                    .setOpportunitySchedulingType( scheduling.getOpportunitySchedulingType() )
                    .setUser( scheduling.getUser() )
                    .setStatus( scheduling.getStatus() )
                    .setDescription( scheduling.getDescription() )
                    .setNotifyAt( scheduling.getNotifyAt() );
        }

        public Builder setUserScheduling ( Scheduling scheduling ) {
            return setTitle( scheduling.getTitle() )
                    .setDescription( scheduling.getDescription() )
                    .setStatus( scheduling.getStatus() )
                    .setCustomer( scheduling.getCustomer() )
                    .setColor( scheduling.getColor() )
                    .setStartDate( scheduling.getStartDate() )
                    .setEndDate( scheduling.getEndDate() )
                    .setAllDay( scheduling.isAllDay() )
                    .setNotifyAt( scheduling.getNotifyAt() );
        }

        public Builder setCustomer ( Customer customer ) {
            if ( customer == null ) {
                return this;
            }

            JsonObject object = new JsonObject();
            object.addProperty( "id", customer.getId().toString() );
            builderBody.add( "customer", object );
            return this;
        }

        public Builder setUser ( User user ) {
            if ( user == null ) {
                return this;
            }

            JsonObject object = new JsonObject();
            object.addProperty( "id", user.getId() );
            builderBody.add( "user", object );
            return this;
        }

        public Builder setOpportunity ( Opportunity opportunity ) {
            if ( opportunity == null ) {
                return this;
            }

            JsonObject object = new JsonObject();
            object.addProperty( "id", opportunity.getId().toString() );
            builderBody.add( "opportunity", object );
            return this;
        }

        public Builder setStartDate ( Date startDate ) {
            builderBody.addProperty( "startDate", DateISOUtils.fromDate( startDate ) );
            return this;
        }

        public Builder setEndDate ( Date endDate ) {
            builderBody.addProperty( "endDate", DateISOUtils.fromDate( endDate ) );
            return this;
        }

        public Builder setAllDay ( boolean allDay ) {
            builderBody.addProperty( "allDay", allDay );
            return this;
        }

        public Builder setStatus ( @SchedulingStatus String status ) {
            builderBody.addProperty( "status", status );
            return this;
        }

        public Builder setOpportunitySchedulingType ( OpportunitySchedulingType opportunitySchedulingType ) {
            JsonObject object = new JsonObject();
            object.addProperty( "id", opportunitySchedulingType.getId() );
            builderBody.add( "opportunitySchedulingType", object );
            return this;
        }

        public Builder setTitle ( String title ) {
            builderBody.addProperty( "title", title );
            return this;
        }

        public Builder setDescription ( String description ) {
            builderBody.addProperty( "description", description );
            return this;
        }

        public Builder setColor ( String color ) {
            builderBody.addProperty( "color", color );
            return this;
        }

        public Builder setNotifyAt ( Date date ) {
            builderBody.addProperty( "notifyAt", DateISOUtils.fromDate( date ) );
            return this;
        }

        public SchedulingRequestBody build () {
            return new SchedulingRequestBody( builderBody );
        }
    }
}
