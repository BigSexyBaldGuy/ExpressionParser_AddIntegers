package expressions;

import java.text.ParseException;

// Todo: Should this class be final?
public class Expression {

    // Todo: public object MUST be in the javadoc
    public Expression(String expressionToParse) throws ParseException
    {
        //Todo: Call our parser
        String[] tokenizedExpression = Parse.parse(expressionToParse);

       //Todo: return tokenizedExpression
    }

    // Todo: change code so that it is NOT like his in Parse
    public static void  main(String arg[]) throws ParseException {
        int     errors = 0;
        int     testNumber;

        String toParse[] = {
                "1 + 2",
        };
        String parseResults[] = {
                "1+2",
        };

        if (toParse.length != parseResults.length) {
            /*
             *  our toParse array size does not match
             *  our parseResults array size. A value
             *  has been added or removed from one array
             *  and not the other.
             */
            System.out.println("*** ERROR *** " +
                    toParse.length +
                    " strings to parse and " +
                    parseResults.length +
                    " results");
            System.exit(1);
        }


        errors = 0;
        for (testNumber = 0; (testNumber < toParse.length);
             ++testNumber) {
            int whichToken;
            String tokens[];
            String theseResults[];



            try {
                /*
                 *  Do the parsing.
                 */

                Expression expression = new Expression(toParse[testNumber]);
            } catch (Exception exception) {
                /*
                 *  Got an exception.
                 */
                if ((exception instanceof ParseException) != true) {
                    /*
                     *  It's the wrong exception.
                     */
                    System.out.println("*** ERROR ***");
                    ++errors;
                }
                exception.printStackTrace(System.out);
                continue;
            }

            if (errors > 0) {
                System.out.println("\nUNIT TEST FAILED with " +
                        errors + " errors!");
                System.exit(1);
            }
        }
    }
}
