package expressions;

import java.text.ParseException;

public class Addition extends Expression
{
    // Variables declared here so that a new instance variable is
    // created and initialized to a default value as part of the
    // object creation of the class
    private int firstInteger;
    private int secondInteger;

    // integer1 and integer2 are reference variables as they
    // each reference an instance of the Integer class.
    public Addition(Integer integer1, Integer integer2) throws ParseException
    {
        super();

        firstInteger = integer1.getValue();
        secondInteger = integer2.getValue();
    }

    // getValue() for firstInteger
    private int getFirstIntegerValue()
    {
        return (firstInteger);
    }

    // getValue() for secondInteger
    private int getSecondIntegerValue()
    {
        return (secondInteger);
    }

    // getValue() for the sum result of integer1 and integer2
    public int getValue()
    {
        return (this.getFirstIntegerValue() + this.getSecondIntegerValue());
    }

    // getValue() to return the string representation of the addition
    // expression stored in state
    public String toString(){
        return this.getFirstIntegerValue() + " + " + this.getSecondIntegerValue();
    }

    // Todo: change code so that it is NOT like his in Parse
    public static void  main(String arg[]) throws ParseException
    {
        int     errors = 0;

        String integer1[] = {
                "1",
        };
        String integer2[] = {
                "2",
        };
        String addResults[] = {
                "3",
        };

        if (integer1.length != addResults.length ||
            integer2.length != addResults.length) {
            /*
             *  our addResults array size does not match
             *  either our integer1 array or our integer2 array.
             *  we need 2 values to test the addition class so
             *  all 3 need to have the number of entries.
             */
            System.out.println("*** ERROR *** " +
                    integer1.length +
                    " integer1 to add or " +
                    integer2.length +
                    " integer2 to add does not match " +
                    addResults.length +
                    " add results");
            System.exit(1);
        }


        errors = 0;
        for (int testNumber = 0; (testNumber < integer1.length);
             ++testNumber) {
            int whichToken;
            String tokens[];
            String theseResults[];


            try {
                /*
                 *  Do the addition.
                 */
                Integer testInteger1 = new Integer(integer1[testNumber]);
                Integer testInteger2 = new Integer(integer2[testNumber]);
                Addition addition = new Addition(testInteger1,testInteger2);
                int results = addition.getValue();

               if (addResults[testNumber].equals(String.valueOf(results))){
                    System.out.println("Passed!");
               }

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
