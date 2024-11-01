package lt.vu.persistence;

import lt.vu.entities.Player;
import lt.vu.entities.Team;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PlayersDAO {

    @Inject
    private EntityManager em;

    public void persist(Player player){
        this.em.persist(player);
    }

    public void persist(Team team){
        this.em.persist(team);
    }

    public Player findOne(Integer id){
        return em.find(Player.class, id);
    }

    public Player update(Player player){
        return em.merge(player);
    }

    @Transactional
    public void delete(Player player) {
        player = em.merge(player);
        em.remove(player);
    }

    public Team findTeamByName(String team) {
        return em.createNamedQuery("Team.findByName", Team.class)
                .setParameter("name", team)
                .getSingleResult();
    }
    public List<Player> findAll(){
        return em.createNamedQuery("Player.findAll", Player.class).getResultList();
    }

}
