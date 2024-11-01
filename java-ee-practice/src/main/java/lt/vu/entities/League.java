package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter @Setter
@NamedQueries({
        @NamedQuery(name = "League.findAll", query = "select l from League as l")
})
public class League {
    private Long id;

    @GeneratedValue
    @Id
    public Long getId() {
        return id;
    }

    private String name;

    @Basic
    public String getName() {
        return name;
    }

    private String shortName;

    @Basic
    public String getShortName() {
        return shortName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        League league = (League) o;
        return id.equals(league.id) && Objects.equals(name, league.name) && Objects.equals(shortName, league.shortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName);
    }

    private List<Team> teams = new ArrayList<>();

    @ManyToMany(mappedBy = "leagues")
    public List<Team> getTeams() {
        return teams;
    }

}
