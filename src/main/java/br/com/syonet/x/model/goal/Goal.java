package br.com.syonet.x.model.goal;

import java.io.Serializable;

public class Goal implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private int target;
    @GoalType
    private String type;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getTarget () {
        return target;
    }

    public void setTarget ( int target ) {
        this.target = target;
    }

    public String getType () {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }
}
