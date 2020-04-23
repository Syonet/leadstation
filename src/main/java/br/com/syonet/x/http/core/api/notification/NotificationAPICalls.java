package br.com.syonet.x.http.core.api.notification;

import java.util.List;
import java.util.UUID;

import br.com.syonet.x.model.notification.Notification;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NotificationAPICalls {
    @GET( "api/v1/notifications" )
    Call< List< Notification > > getNotifications ( @Query( "page" ) int page );

    @PUT( "api/v1/notifications/{id}/read" )
    Call< Notification > readNotification ( @Path( "id" ) UUID id );

    @PUT( "api/v1/notifications/read" )
    Call< Void > readAllNotifications ();

    @GET( "api/v1/notifications/unread" )
    Call< Integer > getUnreadCount ();
}
