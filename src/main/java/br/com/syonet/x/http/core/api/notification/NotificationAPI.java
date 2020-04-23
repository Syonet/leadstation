package br.com.syonet.x.http.core.api.notification;

import static br.com.syonet.x.http.core.API.executeCall;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.exception.APICoreException;
import br.com.syonet.x.exception.AppException;
import br.com.syonet.x.http.core.APIResponse;
import br.com.syonet.x.model.notification.Notification;


public class NotificationAPI {
    private NotificationAPICalls api;
	public NotificationAPI (NotificationAPICalls api) {
		this.api = api;
    }

    public APIResponse< List< Notification > > getNotifications ( int page ) throws APICoreException, AppException {
        return executeCall( this.api.getNotifications( page ) );
    }

    public Notification readNotification ( UUID id ) throws APICoreException, AppException {
        return executeCall( this.api.readNotification( id ) ).getContent();
    }

    public void readAllNotifications () throws APICoreException, AppException {
        executeCall( this.api.readAllNotifications() );
    }

    public Integer getUnreadCount () throws APICoreException, AppException {
        return executeCall( this.api.getUnreadCount() ).getContent();
    }
}
