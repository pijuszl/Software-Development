package lt.vu.async;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class RandomScore{
    @Inject
    private ScoreService scoreService;
    
    public int randomizeScore() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return scoreService.randomizeScore();
    }
}
