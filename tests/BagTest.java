import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BagTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void test_bag_can_hold_a_maximum_of_12_balls() throws RulesViolationException{
        Bag aBag = new Bag();
        for (int i = 0; i < 12; i++) {
            aBag.addBall(new Ball(Color.BLUE));
        }
        expectedEx.expect(BagOverflowException.class);
        expectedEx.expectMessage("Bag can hold a maximum of 12 balls");
        aBag.addBall(new Ball(Color.BLUE));

    }

    @Test
    public void test_bag_cannot_have_more_than_3_green_balls() throws RulesViolationException{
        Bag aBag = new Bag();
        aBag.addBall(new Ball(Color.GREEN));
        aBag.addBall(new Ball(Color.GREEN));
        aBag.addBall(new Ball(Color.GREEN));

        expectedEx.expect(GreenBallMaxLimitExceedException.class);
        expectedEx.expectMessage("Green Balls can not exceed more than 3.");
        aBag.addBall(new Ball(Color.GREEN));
    }

    @Test
    public void test_red_balls_cannot_be_more_than_double_the_green_balls() throws RulesViolationException{
        Bag aBag = new Bag();

        expectedEx.expect(RedBallMaxLimitExceedException.class);
        expectedEx.expectMessage("Red Balls can not exceed more than double the green balls.");
        aBag.addBall(new Ball(Color.RED));

        aBag.addBall(new Ball(Color.GREEN));
        aBag.addBall(new Ball(Color.RED));
        aBag.addBall(new Ball(Color.RED));
        expectedEx.expect(RedBallMaxLimitExceedException.class);
        expectedEx.expectMessage("Red Balls can not exceed more than double the green balls.");
        aBag.addBall(new Ball(Color.RED));
    }

    @Test
    public void test_yellow_balls_cannot_be_more_than_40percent_of_total_balls() throws RulesViolationException{
        Bag aBag = new Bag();
        expectedEx.expect(YellowBallMaxLimitExceedException.class);
        expectedEx.expectMessage("Not more than 40% of the balls may be yellow");
        aBag.addBall(new Ball(Color.YELLOW));

    }

    @Test
    public void test_can_succesfully_add_yellow_ball_when_at_least_3_other_balls_are_present() throws RulesViolationException{
        Bag aBag = new Bag();
        aBag.addBall(new Ball(Color.BLUE));
        aBag.addBall(new Ball(Color.BLUE));
        aBag.addBall(new Ball(Color.BLUE));
        aBag.addBall(new Ball(Color.YELLOW));
    }

}

