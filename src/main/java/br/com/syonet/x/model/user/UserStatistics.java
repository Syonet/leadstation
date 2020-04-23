package br.com.syonet.x.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import br.com.syonet.x.model.goal.GoalProgress;

public class UserStatistics implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList< Map< String, Object > > phases;
    private Map< String, Object > schedules;
    private Map< String, Object > opportunities;
    private ArrayList< GoalProgress > goalProgresses;

    public ArrayList< Map< String, Object > > getPhases () {
        return phases;
    }

    public void setPhases ( ArrayList< Map< String, Object > > phases ) {
        this.phases = phases;
    }

    public Map< String, Object > getSchedules () {
        return schedules;
    }

    public void setSchedules ( Map< String, Object > schedules ) {
        this.schedules = schedules;
    }

    public Map< String, Object > getOpportunities () {
        return opportunities;
    }

    public void setOpportunities ( Map< String, Object > opportunities ) {
        this.opportunities = opportunities;
    }

    public ArrayList< GoalProgress > getGoalProgresses () {
        return goalProgresses;
    }

    public void setGoalProgresses ( ArrayList< GoalProgress > goalProgresses ) {
        this.goalProgresses = goalProgresses;
    }
}
