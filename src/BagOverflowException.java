/**
 * Created by poojar on 31/10/15.
 */
public class BagOverflowException extends RulesViolationException{
    BagOverflowException() {
        super("Bag can hold a maximum of 12 balls");
    }
}
