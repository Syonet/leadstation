package br.com.syonet.x.model.user.preference;

import java.util.HashSet;

public class CustomerUserPreference extends UserPreference {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HashSet< String > tags;

    public HashSet< String > getTags () {
        return tags;
    }

    public void setTags ( HashSet< String > tags ) {
        this.tags = tags;
    }
}
