package lt.vu.usecases;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

import lt.vu.entities.Player;
import lt.vu.entities.Team;
import lt.vu.interceptors.LoggedInvocation;
import lt.vu.persistence.PlayersDAO;
import lt.vu.persistence.TeamsDAO;
import lombok.Getter;
import lombok.Setter;

@Model
public class PlayersForTeam implements Serializable {

    @Inject
    private TeamsDAO teamsDAO;

    @Inject
    private PlayersDAO playersDAO;

    @Getter @Setter
    private Team team;

    @Getter @Setter
    private Player playerToCreate = new Player();

    @Transactional
    @LoggedInvocation
    public void createPlayer() {
        playerToCreate.setTeam(this.team);
        playersDAO.persist(playerToCreate);
    }

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer teamId = Integer.parseInt(requestParameters.get("teamId"));
        this.team = teamsDAO.findOne(teamId);
    }
}
