package lt.vu.rest.contracts;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PlayerDTO {

    private String Name;

    private Integer JerseyNumber;

    private String team;
}
