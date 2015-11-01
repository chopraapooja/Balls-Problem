/**
 * Created by poojar on 31/10/15.
 */
public class RedBallMaxLimitExceedException extends RulesViolationException{
    RedBallMaxLimitExceedException() {
        super("Red Balls can not exceed more than double the green balls.");
    }
}
