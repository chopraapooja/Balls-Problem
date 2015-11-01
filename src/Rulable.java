import java.util.ArrayList;

/**
 * Created by poojar on 31/10/15.
 */
public interface Rulable {
    void execute(Bag bag, Ball ball) throws GreenBallMaxLimitExceedException, RedBallMaxLimitExceedException, YellowBallMaxLimitExceedException;
}
