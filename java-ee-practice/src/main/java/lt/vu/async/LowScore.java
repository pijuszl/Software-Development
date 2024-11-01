package lt.vu.async;
import javax.enterprise.inject.Default;
import java.util.Random;

@Default
public class LowScore implements ScoreService {
    @Override
    public int randomizeScore() {
        return new Random().nextInt(50);
    }
}
