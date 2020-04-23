package br.com.syonet.x.http.core.api.scheduling;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.model.AppError;
import br.com.syonet.x.model.opportunity.scheduling.OpportunitySchedulingType;
import br.com.syonet.x.model.scheduling.Scheduling;
import br.com.syonet.x.model.scheduling.SchedulingRequestBody;
import br.com.syonet.x.util.DateISOUtils;

public class SchedulingAPI {
    private SchedulingAPICalls api;

	public SchedulingAPI (SchedulingAPICalls api ) {
        this.api = api;
    }

    public ArrayList< Scheduling > getSchedules ( Date initialDate, Date finalDate, Set< Integer > usersId )
            throws APICoreException, AppException {
    	 if ( usersId.isEmpty() ) {
             throw new AppException( new AppError(0, "usersId cannot be empty" ) );
         }
    	 
        return executeCall( this.api.getSchedules( DateISOUtils.fromDate( initialDate ),
                DateISOUtils.fromDate( finalDate ), usersId ) ).getContent();
    }

    public Scheduling getScheduling ( UUID schedlingId ) throws APICoreException, AppException {
        return executeCall( this.api.getScheduling( schedlingId ) ).getContent();
    }

    public Scheduling createScheduling ( SchedulingRequestBody schedulingRequestBody )
            throws APICoreException, AppException {
        return executeCall( this.api.createScheduling( schedulingRequestBody.getBody() ) ).getContent();
    }

    public Scheduling patchScheduling ( UUID scheduleId, SchedulingRequestBody schedulingRequestBody )
            throws APICoreException, AppException {
        return executeCall( this.api.patchScheduling( scheduleId, schedulingRequestBody.getBody() ) )
                .getContent();
    }

    public void deleteScheduling ( UUID scheduleId ) throws APICoreException, AppException {
        executeCall( this.api.deleteScheduling( scheduleId ) );
    }

    public ArrayList< Scheduling > getOpportunitySchedules ( UUID opportunityId ) throws APICoreException,
            AppException {
        return executeCall( this.api.getOpportunitySchedules( opportunityId ) ).getContent();
    }

    public ArrayList< OpportunitySchedulingType > getOpportunitySchedulingTypes () throws APICoreException,
            AppException {
        return executeCall( this.api.getOpportunitySchedulingTypes() ).getContent();
    }
}
