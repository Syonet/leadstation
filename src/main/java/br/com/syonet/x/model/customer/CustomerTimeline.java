package br.com.syonet.x.model.customer;

import java.util.Date;

import com.google.gson.JsonElement;

import br.com.syonet.x.model.user.User;

public class CustomerTimeline {
    @CustomerTimelineType
    private String type;
    private Date date;
    private JsonElement payload;
    private User user;

    public @CustomerTimelineType
    String getType () {
        return type;
    }

    public void setType ( @CustomerTimelineType String type ) {
        this.type = type;
    }

    public Date getDate () {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }

    public JsonElement getPayload () {
        return payload;
    }

    public void setPayload ( JsonElement payload ) {
        this.payload = payload;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }
}
