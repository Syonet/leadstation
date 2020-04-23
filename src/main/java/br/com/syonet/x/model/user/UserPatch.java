package br.com.syonet.x.model.user;

import com.google.gson.JsonObject;

import br.com.syonet.x.util.gson.GsonUtils;

public class UserPatch {
    private JsonObject body;

    private UserPatch ( JsonObject body ) {
        this.body = body;
    }

    public JsonObject getBody () {
        return body;
    }

    public static class Builder {
        private JsonObject builderBody = new JsonObject();

        public Builder setName ( String name ) {
            builderBody.addProperty( "name", name );
            return this;
        }

        public Builder setEmail ( String email ) {
            builderBody.addProperty( "email", email );
            return this;
        }

        public Builder setPreferences ( UserPreferences preferences ) {
            builderBody.add( "preferences", GsonUtils.getGson().toJsonTree( preferences ) );
            return this;
        }

        public UserPatch build () {
            return new UserPatch( builderBody );
        }
    }
}
