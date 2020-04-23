package br.com.syonet.x.model.goal;

import java.io.Serializable;

public class GoalProgress implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Goal goal;
    private int current;

    public Goal getGoal () {
        return goal;
    }

    public void setGoal ( Goal goal ) {
        this.goal = goal;
    }

    public int getCurrent () {
        return current;
    }

    public void setCurrent ( int current ) {
        this.current = current;
    }
}
