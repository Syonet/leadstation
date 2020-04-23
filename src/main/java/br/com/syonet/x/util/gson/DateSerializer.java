package br.com.syonet.x.util.gson;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import br.com.syonet.x.util.DateISOUtils;

public class DateSerializer implements JsonSerializer< Date >, JsonDeserializer< Date > {
    @Override
    public JsonElement serialize ( Date date, Type typeOfSrc, JsonSerializationContext context ) {
        String dateStr = DateISOUtils.fromDate( date );
        if ( dateStr == null || dateStr.trim().equals("") ) {
            return null;
        }

        return new JsonPrimitive( dateStr );
    }

    @Override
    public Date deserialize ( JsonElement json, Type typeOfT, JsonDeserializationContext context )
            throws JsonParseException {
        if ( json == null || json.isJsonNull() ) {
            return null;
        }

        return DateISOUtils.toDate( json.getAsString() );
    }
}