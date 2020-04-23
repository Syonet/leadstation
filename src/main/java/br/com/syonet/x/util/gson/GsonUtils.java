package br.com.syonet.x.util.gson;

import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;

public class GsonUtils {
	private GsonUtils() {
		
	}
    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter( Date.class, new DateSerializer() )
            .create();

    public static Gson getGson () {
        return GSON;
    }

    public static JsonArray toJsonArray ( Object object ) {
        if ( object == null ) {
            return new JsonArray();
        }
        return GSON.toJsonTree( object ).getAsJsonArray();
    }
}