package lt.vu.async;

import lt.vu.interceptors.LoggedInvocation;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Named
@ApplicationScoped
public class ScoreGenerator implements Serializable {

    @Inject
    RandomScore randomScore;
    
    private CompletableFuture<Integer> futureScore = null;
    
    @LoggedInvocation
    public String generateScore() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        futureScore = CompletableFuture.supplyAsync(() -> randomScore.randomizeScore());
        return "/playerDetails.xhtml?faces-redirect=true&playerId=" + requestParameters.get("playerId");
    }
    
    public boolean isScoreGenerationRunning() {
        return futureScore != null && !futureScore.isDone();
    }
    
    public String getScoreGenerationStatus() {
        if (futureScore == null) {
            return "null";
        } else if (isScoreGenerationRunning()) {
            return "Score generation in progress";
        }
        try {
            return "Generated score: " + futureScore.get();
        } catch (Exception e) {
            return "Score generation failed";
        }
    }
    

}
