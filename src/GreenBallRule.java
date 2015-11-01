/**
 * Created by poojar on 31/10/15.
 */
public class GreenBallRule implements Rulable {
    @Override
    public void execute(Bag bag, Ball ball) throws GreenBallMaxLimitExceedException {
        if(ball.color() == Color.GREEN && bag.countBalls(Color.GREEN) >= 3)
            throw new GreenBallMaxLimitExceedException();
    }
}
