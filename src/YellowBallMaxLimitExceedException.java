/**
 * Created by poojar on 31/10/15.
 */
public class YellowBallMaxLimitExceedException extends RulesViolationException{
    YellowBallMaxLimitExceedException() {
        super("Not more than 40% of the balls may be yellow");
    }
}
