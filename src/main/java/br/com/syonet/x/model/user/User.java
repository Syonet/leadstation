package br.com.syonet.x.model.user;

import java.io.Serializable;
import java.util.ArrayList;

import br.com.syonet.x.model.company.Company;

public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
    private String name;
    private String email;
    private String password;
    private String avatar;
    private boolean admin;
    private boolean qualifier;

    private ArrayList< Company > companies;
    private ArrayList< UserTeam > teams;
    private UserPreferences preferences;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword ( String password ) {
        this.password = password;
    }

    public String getAvatar () {
        return avatar;
    }

    public void setAvatar ( String avatar ) {
        this.avatar = avatar;
    }

    public boolean isAdmin () {
        return admin;
    }

    public void setAdmin ( boolean admin ) {
        this.admin = admin;
    }

    public boolean isQualifier () {
        return qualifier;
    }

    public void setQualifier ( boolean qualifier ) {
        this.qualifier = qualifier;
    }

    public ArrayList< Company > getCompanies () {
        return companies;
    }

    public void setCompanies ( ArrayList< Company > companies ) {
        this.companies = companies;
    }

    public ArrayList< UserTeam > getTeams () {
        return teams;
    }

    public void setTeams ( ArrayList< UserTeam > teams ) {
        this.teams = teams;
    }

    public UserPreferences getPreferences () {
        return preferences;
    }

    public void setPreferences ( UserPreferences preferences ) {
        this.preferences = preferences;
    }
}
