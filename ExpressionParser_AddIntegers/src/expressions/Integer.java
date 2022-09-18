package expressions;

import java.text.ParseException;

// Todo: Should this class be final?
public class Integer extends Expression{

    private int integerValue;

    public Integer(String inputInteger) throws ParseException {
        super();
        integerValue =  java.lang.Integer.parseInt(inputInteger);
    }

    public int getValue() {
        return integerValue;
    }

    public String toString(){
        return String.valueOf(this.integerValue);
    }
}
