package br.com.syonet.x.model.template;

import java.io.Serializable;

import br.com.syonet.x.model.user.User;

public class Template implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String body;
    @TemplateType
    private String type;
    private int createdBy;
    private User user;
    @TemplateCategory
    private int category;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getBody () {
        return body;
    }

    public void setBody ( String body ) {
        this.body = body;
    }

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public int getCreatedBy () {
        return createdBy;
    }

    public void setCreatedBy ( int createdBy ) {
        this.createdBy = createdBy;
    }

    public User getUser () {
        return user;
    }

    public void setUser ( User user ) {
        this.user = user;
    }

    public int getCategory () {
        return category;
    }

    public void setCategory ( int category ) {
        this.category = category;
    }
}
