package br.com.syonet.x.model.opportunity;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class OpportunityStatistics {
    private JsonObject created;
    private JsonObject sold;
    private JsonObject lost;
    private JsonArray salesForecast;
    private JsonArray schedules;
    private JsonObject temperatures;

    public JsonObject getCreated () {
        return created;
    }

    public void setCreated ( JsonObject created ) {
        this.created = created;
    }

    public JsonObject getSold () {
        return sold;
    }

    public void setSold ( JsonObject sold ) {
        this.sold = sold;
    }

    public JsonObject getLost () {
        return lost;
    }

    public void setLost ( JsonObject lost ) {
        this.lost = lost;
    }

    public JsonArray getSalesForecast () {
        return salesForecast;
    }

    public void setSalesForecast ( JsonArray salesForecast ) {
        this.salesForecast = salesForecast;
    }

    public JsonArray getSchedules () {
        return schedules;
    }

    public void setSchedules ( JsonArray schedules ) {
        this.schedules = schedules;
    }

    public JsonObject getTemperatures () {
        return temperatures;
    }

    public void setTemperatures ( JsonObject temperatures ) {
        this.temperatures = temperatures;
    }
}
