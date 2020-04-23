package br.com.syonet.x.model.scheduling;

import java.io.Serializable;
import java.util.HashSet;

public class ScheduleFilter implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean showWithoutOpportunity;
    private boolean showWithOpportunity;
    private HashSet< Integer > types;
    private HashSet< Integer > selectedUserIds;
    private Integer selectedTeamId;

    public ScheduleFilter () {
        showWithoutOpportunity = true;
        showWithOpportunity = true;
        types = new HashSet<>();
        selectedUserIds = new HashSet<>();
        selectedTeamId = 0;
    }

    public boolean isShowWithoutOpportunity () {
        return showWithoutOpportunity;
    }

    public void setShowWithoutOpportunity ( boolean showWithoutOpportunity ) {
        this.showWithoutOpportunity = showWithoutOpportunity;
    }

    public boolean isShowWithOpportunity () {
        return showWithOpportunity;
    }

    public void setShowWithOpportunity ( boolean showWithOpportunity ) {
        this.showWithOpportunity = showWithOpportunity;
    }

    public HashSet< Integer > getTypes () {
        return types;
    }

    public void setTypes ( HashSet< Integer > types ) {
        this.types = types;
    }

    public HashSet< Integer > getSelectedUserIds () {
        return selectedUserIds;
    }

    public void setSelectedUserIds ( HashSet< Integer > selectedUserIds ) {
        this.selectedUserIds = selectedUserIds;
    }

    public Integer getSelectedTeamId () {
        return selectedTeamId;
    }

    public void setSelectedTeamId ( Integer selectedTeamId ) {
        this.selectedTeamId = selectedTeamId;
    }
}
