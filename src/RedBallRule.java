/**
 * Created by poojar on 31/10/15.
 */
public class RedBallRule implements Rulable {
    @Override
    public void execute(Bag bag, Ball ball) throws RedBallMaxLimitExceedException {
        if(ball.color() == Color.RED && 2*bag.countBalls(Color.GREEN) >= bag.countBalls(Color.RED))
            throw new RedBallMaxLimitExceedException();

    }
}
