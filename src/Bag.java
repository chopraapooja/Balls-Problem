import java.util.ArrayList;

/**
 * Created by poojar on 31/10/15.
 */
public class Bag {
    public static final int MAX_BAG_SIZE = 12;
    private ArrayList<Ball> balls = new ArrayList<>();

    public int addBall(Ball newBall) throws RulesViolationException {
        if(isFull())
            throw new BagOverflowException();

        checkRules(newBall);
        balls.add(newBall);
        return balls.size();
    }

    private boolean isFull() {
        return balls.size() == MAX_BAG_SIZE;
    }

    private void checkRules(Ball newBall) throws RulesViolationException {
        new GreenBallRule().execute(this, newBall);
        new RedBallRule().execute(this, newBall);
        new YellowBallRule().execute(this, newBall);
    }

    public int countBalls(Color color) {
        int counter = 0;
        for(Ball aBall : balls) {
            if(aBall.color() == color) counter++;
        }
        return counter;
    }

    public int totalBalls() {
        return balls.size();
    }
}
