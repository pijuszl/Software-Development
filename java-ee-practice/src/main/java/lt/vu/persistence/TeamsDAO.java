package lt.vu.persistence;

import lombok.Setter;
import lt.vu.entities.Team;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Setter
@RequestScoped
public class TeamsDAO implements TeamsDAOLocal{

    @Inject
    private EntityManager em;

    public List<Team> loadAll() {
        return em.createNamedQuery("Team.findAll", Team.class).getResultList();
    }

    public void persist(Team team){
        this.em.persist(team);
    }

    public Team findOne(Integer id) {
        return em.find(Team.class, id);
    }

    public List loadTeam(String s) {
        s = s.toUpperCase();
        return em.createQuery(
                "select t " +
                    "from Team as t " +
                    "where upper(t.name) like :teamName")
                .setParameter("teamName", s == null ? "" : "%" + s + "%").
                getResultList();
    }
}
