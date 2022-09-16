package expressions;

import java.text.ParseException;

// Todo: Should this class be final?
public class Addition extends Expression{

    public Addition(String token1, String token2)
            throws ParseException {
        super("A");
    }
}
