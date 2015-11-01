/**
 * Created by poojar on 31/10/15.
 */
public class YellowBallRule implements Rulable {
    @Override
    public void execute(Bag bag, Ball ball) throws YellowBallMaxLimitExceedException {
        if(ball.color() == Color.YELLOW && bag.countBalls(Color.YELLOW) >= 0.4*bag.totalBalls())
            throw new YellowBallMaxLimitExceedException();
    }
}
