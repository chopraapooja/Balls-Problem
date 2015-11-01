/**
 * Created by poojar on 31/10/15.
 */
public class GreenBallMaxLimitExceedException extends RulesViolationException{
    GreenBallMaxLimitExceedException() {
        super("Green Balls can not exceed more than 3.");
    }
}