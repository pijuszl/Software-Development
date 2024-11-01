package lt.vu.rest;

import lt.vu.entities.Player;
import lt.vu.entities.Team;
import lt.vu.persistence.PlayersDAO;
import lt.vu.rest.contracts.PlayerDTO;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.OptimisticLockException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@ApplicationScoped
@Path("/players")
public class PlayersController {

    @Inject
    private PlayersDAO playersDAO;

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlayers() {
        List<Player> players = playersDAO.findAll();
        if (players == null || players.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        List<PlayerDTO> playerDTOs = players.stream()
                .map(player -> {
                    PlayerDTO dto = new PlayerDTO();
                    dto.setName(player.getName());
                    dto.setTeam(player.getTeam().getName());
                    return dto;
                })
                .collect(Collectors.toList());

        return Response.ok(playerDTOs).build();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") final Integer id) {
        Player player = playersDAO.findOne(id);
        if (player == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setName(player.getName());
        playerDTO.setTeam(player.getTeam().getName());

        return Response.ok(playerDTO).build();
    }

    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response update(@PathParam("id") final Integer playerId, PlayerDTO playerData) {
        try {
            Player existingPlayer = playersDAO.findOne(playerId);
            if (existingPlayer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            existingPlayer.setName(playerData.getName());
            playersDAO.update(existingPlayer);
            return Response.ok().build();
        } catch (OptimisticLockException ole) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }

    @Path("/create")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(PlayerDTO playerData) {
        try {
            Player newPlayer = new Player();
            newPlayer.setName(playerData.getName());

            Team team = playersDAO.findTeamByName(playerData.getTeam());
            if (team == null) {
                return Response.status(Response.Status.BAD_REQUEST).entity("Team does not exist").build();
            }

            newPlayer.setTeam(team);
            playersDAO.persist(newPlayer);

            // After persisting, the id should be set to the newPlayer object
            return Response.ok(newPlayer.getId()).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @Path("/{id}")
    @DELETE
    @Transactional
    public Response delete(@PathParam("id") final Integer playerId) {
        Player existingPlayer = playersDAO.findOne(playerId);
        if (existingPlayer == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        playersDAO.delete(existingPlayer);
        return Response.ok().build();
    }
}