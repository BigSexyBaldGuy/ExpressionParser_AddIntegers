package expressions;

import java.text.ParseException;

// Todo: Should this class be final?
public class Integer extends Expression{

    public Integer(String tokenValue) throws ParseException {
        super(tokenValue);
    }
}
