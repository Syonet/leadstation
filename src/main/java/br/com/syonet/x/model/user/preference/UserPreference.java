package br.com.syonet.x.model.user.preference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class UserPreference implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList< FilterPreference > filters;
    private Map< String, Object > createdAt;

    public ArrayList< FilterPreference > getFilters () {
        return filters;
    }

    public void setFilters ( ArrayList< FilterPreference > filters ) {
        this.filters = filters;
    }

    public Map< String, Object > getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt ( Map< String, Object > createdAt ) {
        this.createdAt = createdAt;
    }
}
