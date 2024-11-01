package lt.vu.persistence;

import lt.vu.entities.Team;

import java.util.List;

public interface TeamsDAOLocal {
    List<Team> loadAll();
    void persist(Team team);
    Team findOne(Integer id);
}